package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import configuration.ApiFeature;
import configuration.Authentication;
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
        LOGGER.info("--> given");
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("--> when");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        //apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Then("Status response of request should be added {string}")
    public void theResponseStatusShouldBeOK(String statusCode) {
        LOGGER.info("--> response");
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }
}
