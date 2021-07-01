package rest.salesforce.org.steps;

import salesforce.ApiEndPoints;
import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import salesforce.entities.Response;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class DeleteSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public DeleteSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @When("I execute delete {string} request")
    public void iExecuteDeleteRequest(String endpoint) {
        LOGGER.info("------ Execute Delete an object ------");
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
