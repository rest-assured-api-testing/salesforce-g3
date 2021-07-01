package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
import api.ApiManager;
import api.ApiMethod;
import salesforce.ApiEndPoints;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.entities.Campaign;
import salesforce.entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class CampaignHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public CampaignHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("------ Campaign hook constructor ------");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@UseCreatedCampaign or @CreateCampaign")
    public void createCampaign() throws JsonProcessingException {
        LOGGER.info("------ Create a campaign ------");
        Campaign newCampaign = new Campaign();
        newCampaign.setName("New Campaign");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.CAMPAIGN)
                .body(new ObjectMapper().writeValueAsString(newCampaign));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    @After(value = "@UseCreatedCampaign or @DeleteCampaign")
    public void deleteCampaign() {
        LOGGER.info("------ Delete a campaign ------");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.CAMPAIGN_ID)
                .addPathParam("CAMPAIGN_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
