package rest.salesforce.org.steps;

import salesforce.ApiEndPoints;
import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import salesforce.entities.Response;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class GetSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public GetSteps(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @When("I execute for {string} request with param to get a object info")
    public void iExecuteForRequestWithParamToGetACampaignInfo(String endpoint) {
        LOGGER.info("------ Execute update with body ------");
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, response.getId());
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getPath("id"));
    }
}
