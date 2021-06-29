package rest.salesforce.org.steps;

import api.ApiRequest;
import api.ApiResponse;
import configuration.ApiStatusCode;
import entities.Product2;
import entities.Response;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class Product2Steps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public Product2Steps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Then("The product2 response body name of the attribute is the same as the wait and request must be {string}")
    public void theBodyResponseIsSameNameExpected(String statusCode) {
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
}
