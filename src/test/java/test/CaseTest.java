package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.SuitTestBefore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.ApiFeature;
import entities.Case;
import entities.CaseEnum;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CaseTest extends SuitTestBefore{
    String caseIdCreated;

    @Test
    public void shouldAddNewCase() throws JsonProcessingException {
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(newCase));
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        caseIdCreated = apiResponse.getPath("id");
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @Test
    public void shouldGetAllCases() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CASES);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldGetACaseById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldValidateSchemaOfCaseById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        apiResponse.validateBodySchema("schemas/case.json");
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldUpdateACaseById() throws JsonProcessingException {
        Case updateCase = new Case();
        updateCase.setStatus(CaseEnum.NEW.toStatus());
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated)
                .setBody(new ObjectMapper().writeValueAsString(updateCase));
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }

    @AfterClass
    public void shouldDeleteACaseById() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
}
