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

public class UpdateSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public UpdateSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @When("I execute update {string} request")
    public void iExecuteRequestWithBodyAndParam(String endpoint, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("------ Execute update with body ------");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(endpoint, response.getId())
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I execute update {string} request with specific id {string}")
    public void iExecuteRequestWithBodyAndParam(String endpoint, String specificID, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("------ Execute update with body ------");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(endpoint, specificID)
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
    }
}
