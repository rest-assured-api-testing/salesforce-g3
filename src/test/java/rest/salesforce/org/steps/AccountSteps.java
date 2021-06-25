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


    public AccountSteps(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiResponse = apiResponse;
        this.apiRequest = apiRequest;
    }

    @Given("I build {string} request")
    public void iBuildRequest(String method) {
        LOGGER.info("--> Given account");
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("--> When account");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I execute for {string} request")
    public void iExecuteRequestWithParam(String endpoint) {
        LOGGER.info("--> When contact with param");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam("accountId", apiResponse.getPath("id"));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I execute for {string} request with name {string}")
    public void iExecuteRequestWithBody(String endpoint, String name) throws JsonProcessingException {
        LOGGER.info("--> When contact with param");
        Account account = new Account();
        account.setName(name);
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .body(new ObjectMapper().writeValueAsString(account));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I execute for {string} request with updated name {string}")
    public void iExecuteRequestWithBodyAndParam(String endpoint, String name) throws JsonProcessingException {
        LOGGER.info("--> When contact with param");
        Account account = new Account();
        account.setName(name);
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam("accountId", apiResponse.getPath("id"))
                .body(new ObjectMapper().writeValueAsString(account));
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
    }
}
