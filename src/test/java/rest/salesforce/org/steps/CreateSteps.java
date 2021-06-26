package rest.salesforce.org.steps;

import api.ApiFeature;
import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Response;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class CreateSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public CreateSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @When("I execute create {string} request")
    public void iExecuteCreateRequest(String endpoint, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("------ Execute update with body ------");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
    }
}
