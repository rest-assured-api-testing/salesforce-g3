package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import configuration.Authentication;
import entities.Account;
import entities.Contact;
import entities.Response;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.Given;

public class AccountSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public AccountSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("--> scenario hook constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    // Get All
    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("--> When account");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        ApiManager.execute(apiRequest, apiResponse);
    }

    // Get One
    @When("I execute for {string} request with param")
    public void iExecuteRequestWithParam(String endpoint) {
        LOGGER.info("--> When contact with param");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, apiResponse.getPath("id"));
//        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
//        response.setId(apiResponse.getBody(Response.class).getId());
    }

    // Delete
    @When("I execute for {string} request")
    public void iExecuteRequestWithParamForDelete(String endpoint) {
        LOGGER.info("--> When contact with param");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }

    // Create
    @When("I execute for {string} request with name {string}")
    public void iExecuteRequestWithBody(String endpoint, String name) throws JsonProcessingException {
        LOGGER.info("--> When contact with param");
        Account account = new Account();
        account.setName(name);
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .body(new ObjectMapper().writeValueAsString(account));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    // Update
    @When("I execute for {string} request with updated name {string}")
    public void iExecuteRequestWithBodyAndParam(String endpoint, String name) throws JsonProcessingException {
        LOGGER.info("--> When contact with param");
        Account account = new Account();
        account.setName(name);
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(endpoint, response.getId())
                .body(new ObjectMapper().writeValueAsString(account));
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
//        response.setId(apiResponse.getBody(Response.class).getId());
    }
}
