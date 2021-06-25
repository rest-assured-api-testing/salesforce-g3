package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import configuration.Authentication;
import entities.Case;
import entities.CaseEnum;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;
import org.testng.Assert;
import io.cucumber.java.en.Given;

import static configuration.env.CONFIG;

public class AccountSteps {
    public Logger LOGGER = Logger.getLogger(getClass());
    public Authentication authentication = new Authentication();
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    String token;
    String instance_url;

    @Before(order = 0)
    public void createToken() {
        LOGGER.info("init token");
        authentication.getAuth();
    }

    @Before(order = 1)
    public void setUp() {
        apiRequest = new ApiRequest()
                .addHeader("Content-Type", "application/json");
    }

    @Given("I build {string} request")
    public void iBuildRequest(String method) {
        LOGGER.info("init given");
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
