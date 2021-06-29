package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.ApiEndPoints;
import configuration.ApiStatusCode;
import entities.Account;
import entities.Response;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class AccountSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public AccountSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    // Get All
    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("When execute request");
        apiRequest.setEndpoint(ApiEndPoints.valueOf(endpoint));
        ApiManager.execute(apiRequest, apiResponse);
    }

    // Get One or Delete
    @When("I execute for {string} request with param")
    public void iExecuteRequestWithParam(String endpoint) {
        LOGGER.info("--> When execute with param");
        apiRequest.setEndpoint(ApiEndPoints.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }

    // Create
    @When("I execute for {string} request with params")
    public void iExecuteRequestWithBody(String endpoint, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("--> When execute with body");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    // Update
    @When("I execute for {string} request with updated name")
    public void iExecuteRequestWithBodyAndParam(String endpoint, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("--> When execute with param and body");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, response.getId())
                .body(body);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Then("{string} schema status response of request should be {string}")
    public void theSchemaShouldBeOK(String schema, String statusCode) {
        LOGGER.info("Then response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        apiResponse.validateBodySchema("schemas/" + schema + ".json");
        apiResponse.getResponse().then().log().body();
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
    public void theBodyResponseIsSameNameExpected(String statusCode) {
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
}
