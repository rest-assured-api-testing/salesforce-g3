package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.ApiFeature;
import entities.Response;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class AccountSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public AccountSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    // Get All
    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("When execute request");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        ApiManager.execute(apiRequest, apiResponse);
    }

    // Get One or Delete
    @When("I execute for {string} request with param")
    public void iExecuteRequestWithParam(String endpoint) {
        LOGGER.info("--> When execute with param");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }

    // Create
    @When("I execute for {string} request with params")
    public void iExecuteRequestWithBody(String endpoint, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("--> When execute with body");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    // Update
    @When("I execute for {string} request with updated name")
    public void iExecuteRequestWithBodyAndParam(String endpoint, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("--> When execute with param and body");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(endpoint, response.getId())
                .body(body);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
    }
}
