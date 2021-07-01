package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
import api.ApiManager;
import api.ApiMethod;
import salesforce.ApiEndPoints;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.entities.Case;
import salesforce.entities.CaseEnum;
import salesforce.entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class CaseHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public CaseHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("------ Case hook constructor ------");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@UseCreatedCase or @CreateCase")
    public void createCase() throws JsonProcessingException {
        LOGGER.info("------ Create a case ------");
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.NEW.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.CASE)
                .body(new ObjectMapper().writeValueAsString(newCase));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    @After(value = "@UseCreatedCase or @DeleteCase")
    public void deleteCase() {
        LOGGER.info("------ Delete a case ------");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.CASE_ID)
                .addPathParam("CASE_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
