package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.SuitTestBefore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Case;
import entities.CaseEnum;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CaseTest extends SuitTestBefore{/*
    String caseIdCreated;
    @Test
    public void shouldAddNewCase() throws JsonProcessingException {
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(newCase));
        ApiResponse response = ApiManager.executeWithBody(apiRequest);
        caseIdCreated = response.getPath("id");
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
        response.getResponse().then().log().body();
    }

    @Test
    public void shouldGetAllCases() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CASES);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldGetACaseById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldValidateSchemaOfCaseById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        response.validateBodySchema("schemas/case.json");
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldUpdateACaseById() throws JsonProcessingException {
        Case updateCase = new Case();
        updateCase.setStatus(CaseEnum.NEW.toStatus());
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated)
                .setBody(new ObjectMapper().writeValueAsString(updateCase));
        ApiResponse response = ApiManager.executeWithBody(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }

    @AfterClass
    public void shouldDeleteACaseById() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }*/
}
