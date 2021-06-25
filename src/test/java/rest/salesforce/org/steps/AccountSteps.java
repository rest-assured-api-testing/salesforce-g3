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
import org.testng.Assert;
import io.cucumber.java.en.Given;

public class AccountSteps {
    public Authentication authentication = new Authentication();
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    String token;
    String instance_url;

    @Before(order = 0)
    public void loginAndSetup() {
        authentication.getAuth();
        apiRequest = new ApiRequest()
                .addHeader("Content-Type", "application/json");
    }

    @Given("I build {string} request")
    public void iBuildRequest(String method) {
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Then("Status response of request should be added {string}")
    public void theResponseStatusShouldBeOK(String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }
}
