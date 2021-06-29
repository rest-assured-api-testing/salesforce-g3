package rest.salesforce.org.steps;

import salesforce.ApiEndPoints;
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
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, response.getId())
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
    }

    @When("I execute update {string} request with specific {string}")
    public void iExecuteRequestWithBodyAndParam(String endpoint, String specificID) {
        LOGGER.info("------ Execute update with body ------");
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, specificID);
        ApiManager.execute(apiRequest, apiResponse);
    }
}
