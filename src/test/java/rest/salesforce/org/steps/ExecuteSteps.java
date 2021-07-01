package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import salesforce.entities.Response;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import salesforce.ApiEndPoints;

public class ExecuteSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    private Response response;

    public ExecuteSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    /**
     * Execute EndPoint with no params.
     * @param endpoint, the endpoint alone.
     */
    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("----------- Execute only endpoint -----------");
        apiRequest.setEndpoint(ApiEndPoints.valueOf(endpoint));
        ApiManager.execute(apiRequest, apiResponse);
    }

    /**
     * Execute Endpoint with Id.
     * @param endpoint, endpoint with id parameter.
     */
    @When("I execute {string} request with param")
    public void iExecuteRequestWithParam(String endpoint) {
        LOGGER.info("----------- Execute endpoint with param -----------");
        apiRequest.setEndpoint(ApiEndPoints.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }

    /**
     * Execute Endpoint with manual assigned Id .
     * @param endpoint, endpoint with Id.
     * @param wrongId, Id assigned to endpoint
     */
    @When("I execute {string} with {string}")
    public void iExecuteRequestWithParam(String endpoint, String wrongId) {
        LOGGER.info("----------- Execute with specific Id -----------");
        apiRequest.setEndpoint(ApiEndPoints.valueOf(endpoint));
        apiRequest.addPathParam(endpoint, wrongId);
        ApiManager.execute(apiRequest, apiResponse);
    }
}
