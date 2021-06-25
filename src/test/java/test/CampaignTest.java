package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.BeforeCampaign;
import configuration.ApiFeature;
import entities.CreatedObject;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CampaignTest extends BeforeCampaign {/*
    @Test
    public void createACampaign() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN);
        apiRequest.setBody("{\"Name\":\"Test Campaign\"}");
        apiRequest.setMethod(ApiMethod.POST);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        createdObject = apiResponse.getBody(CreatedObject.class);
        apiResponse.validateBodySchema("schemas/createdobject.json");
        int expected = HttpStatus.SC_CREATED;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNotFoundForUpdateWithInvalidCampaignID() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN_ID);
        apiRequest.addPathParam("campaignId", "7015e000000cngKAAQ");
        apiRequest.setBody("{\"Name\":\"UpdatedName\"}");
        apiRequest.setMethod(ApiMethod.PATCH);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        int expected = HttpStatus.SC_NOT_FOUND;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNotFoundForGetWithInvalidCampaignID() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN_ID);
        apiRequest.addPathParam("campaignId", "7015e000000cngKAAQ");
        apiRequest.setMethod(ApiMethod.GET);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        int expected = HttpStatus.SC_NOT_FOUND;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNotFoundForDeleteWithInvalidCampaignID() {
        apiRequest.setEndpoint(ApiFeature.CAMPAIGN_ID);
        apiRequest.addPathParam("campaignId", "7015e000000cngKAAQ");
        apiRequest.setMethod(ApiMethod.DELETE);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        int expected = HttpStatus.SC_NOT_FOUND;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }*/
}
