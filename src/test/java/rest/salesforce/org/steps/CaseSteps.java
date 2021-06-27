package rest.salesforce.org.steps;

import api.*;
import entities.Response;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class CaseSteps {
    private final Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public CaseSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @When("I execute {string} with correct request")
    public void iExecuteRequestWithParam(String endpoint) {
        LOGGER.info("---------- Execute with specific ID ----------");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I execute {string} with wrong id {string} request")
    public void iExecuteRequestWithParam(String endpoint, String wrongId) {
        LOGGER.info("---------- Execute with specific ID ----------");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, wrongId);
        ApiManager.execute(apiRequest, apiResponse);
    }
}


