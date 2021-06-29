package rest.salesforce.org.steps;

import api.ApiRequest;
import api.ApiResponse;
import configuration.ApiStatusCode;
import entities.Account;
import entities.Campaign;
import entities.Product2;
import entities.Response;
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

    @Then("The account response body name of the attribute is the same as the wait and request must be {string}")
    public void theBodyResponseIsSameNameExpectedAccount(String statusCode) {
        LOGGER.info("Then account response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        Account account = apiResponse.getBody(Account.class);
        Assert.assertEquals(account.getName(), "Before create account cucumber");
        apiResponse.getResponse().then().log().body();
    }

    @Then("The account response body kind of the attribute is the same as the wait and request must be {string}")
    public void theBodyResponseIsKindAccount(String statusCode) {
        LOGGER.info("Then account response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        Account account = apiResponse.getBody(Account.class);
        Assert.assertEquals(account.getAttributes().getType(), "Account");
        apiResponse.getResponse().then().log().body();
    }



    @Then("The product2 response body name of the attribute is the same as the wait and request must be {string}")
    public void theBodyResponseIsSameNameExpectedProduct(String statusCode) {
        LOGGER.info("Then product2 response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        Product2 account = apiResponse.getBody(Product2.class);
        Assert.assertEquals(account.getName(), "Before create product2 cucumber");
        apiResponse.getResponse().then().log().body();
    }

    @Then("The product2 response body kind of the attribute is the same as the wait and request must be {string}")
    public void theBodyResponseIsKindProduct2(String statusCode) {
        LOGGER.info("Then product2 response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        Product2 account = apiResponse.getBody(Product2.class);
        Assert.assertEquals(account.getAttributes().getType(), "Product2");
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
