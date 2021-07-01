package rest.salesforce.org.steps;

import api.ApiRequest;
import api.ApiResponse;
import configuration.ApiStatusCode;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class StatusResponseSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;

    public StatusResponseSteps(ApiRequest apiRequest, ApiResponse apiResponse) {
        LOGGER.info("--> scenario hook constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @Then("Response status should be {string}")
    public void theResponseStatusShouldBeOK(String statusCode) {
        LOGGER.info("Then response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        apiResponse.getResponse().then().log().body();
    }
}
