package rest.salesforce.org.steps;

import api.ApiRequest;
import api.ApiResponse;
import api.ApiStatusCode;
import salesforce.entities.Campaign;
import salesforce.entities.Response;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class BodyResponseSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public BodyResponseSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Then("Response body status request should be {string}")
    public void theBodyResponseIsTrue(String statusCode) {
        LOGGER.info("Then response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        Response response = apiResponse.getBody(Response.class);
        Assert.assertEquals(response.isSuccess(), true);
        apiResponse.getResponse().then().log().body();
    }


    @Then("The campaign response body name of the attribute is the same as the wait and request must be {string}")
    public void theBodyResponseIsSameNameExpectedCampaign(String statusCode) {
        LOGGER.info("Then product2 response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        Campaign account = apiResponse.getBody(Campaign.class);
        Assert.assertEquals(account.getName(), "New Campaign");
        apiResponse.getResponse().then().log().body();
    }
}
