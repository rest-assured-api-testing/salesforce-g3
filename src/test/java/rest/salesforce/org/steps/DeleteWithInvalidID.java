package rest.salesforce.org.steps;

import salesforce.ApiEndPoints;
import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import salesforce.InvalidIDs;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class DeleteWithInvalidID {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;

    public DeleteWithInvalidID(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @When("I execute delete {string} with an {string} request")
    public void iExecuteDeleteWithAnRequest(String endpoint, String ID) {
        LOGGER.info("------ Execute Delete an object ------");
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, InvalidIDs.valueOf(ID).value());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
