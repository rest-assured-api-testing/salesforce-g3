package Tests;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.BeforeCampaign;
import configuration.ApiFeature;
import entities.CreatedObject;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CampaignTest extends BeforeCampaign {
    @Test
    public void createACampaign() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN);
        apiRequest.setBody("{\"Name\":\"Test Campaign\"}");
        apiRequest.setMethod(ApiMethod.POST);
        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        createdObject = apiResponse.getBody(CreatedObject.class);
        apiResponse.validateBodySchema("schemas/createdobject.json");
        int expected = HttpStatus.SC_CREATED;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void UpdateAPriceBook() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN_ID);
        apiRequest.addPathParam("campaignId", "7015e000000cngKAAQ");
        apiRequest.setBody("{\"Name\":\"UpdatedName\"}");
        apiRequest.setMethod(ApiMethod.PATCH);
        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        int expected = HttpStatus.SC_NO_CONTENT;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAPriceBook() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN_ID);
        apiRequest.addPathParam("campaignId", "7015e000000cngKAAQ");
        apiRequest.setMethod(ApiMethod.GET);
        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        int expected = HttpStatus.SC_OK;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void deleteAPriceBook() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN_ID);
        apiRequest.addPathParam("campaignId", "7015e000000cngKAAQ");
        apiRequest.setMethod(ApiMethod.DELETE);
        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        int expected = HttpStatus.SC_NO_CONTENT;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }
}
