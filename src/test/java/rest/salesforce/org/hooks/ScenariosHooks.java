package rest.salesforce.org.hooks;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Case;
import entities.CaseEnum;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class ScenariosHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;

    public ScenariosHooks(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @Before(order = 0)
    public void createToken() {
        LOGGER.info("--> login scenarios");
        apiRequest.addHeader("Content-Type", "application/json");
        apiRequest.clearPathParam();
    }

    @Before(value = "@ShowCaseWithId")
    public void createCase() throws JsonProcessingException {
        LOGGER.info("--> before create case");
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(newCase));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @After(value = "@ShowCaseWithId")
    public void deleteCreatedCase() {
        LOGGER.info("--> after delete case");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", apiResponse.getPath("id"));
        ApiManager.execute(apiRequest, apiResponse);
    }
}
