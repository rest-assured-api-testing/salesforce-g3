package rest.salesforce.org.steps;

import api.ApiFeature;
import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import configuration.InvalidValuesEnum;
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
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(endpoint, InvalidValuesEnum.valueOf(ID).value());
        ApiManager.execute(apiRequest, apiResponse);
    }
}