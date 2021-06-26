package rest.salesforce.org.steps;

import api.ApiRequest;
import api.ApiResponse;
import configuration.ResponseEnum;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class ResponseSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;

    public ResponseSteps(ApiRequest apiRequest, ApiResponse apiResponse) {
        LOGGER.info("--> scenario hook constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    // Generic response
    @Then("Status response of request should be {string}")
    public void theResponseStatusShouldBeOK(String statusCode) {
        LOGGER.info("Then response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ResponseEnum.valueOf(statusCode).value());
        apiResponse.getResponse().then().log().body();
    }
}
