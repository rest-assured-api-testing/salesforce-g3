package rest.salesforce.org.steps;

import api.ApiRequest;
import api.ApiResponse;
import configuration.ApiStatusCode;
import entities.Response;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class SchemaSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public SchemaSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Then("{string} schema status should be {string}")
    public void theSchemaShouldBeOK(String schema, String statusCode) {
        LOGGER.info("Then response status");
        Assert.assertEquals(apiResponse.getStatusCode(), ApiStatusCode.valueOf(statusCode).value());
        apiResponse.validateBodySchema("schemas/" + schema + ".json");
        apiResponse.getResponse().then().log().body();
    }
}
