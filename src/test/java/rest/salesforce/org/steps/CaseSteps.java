package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Case;
import entities.CaseEnum;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import io.cucumber.java.en.Given;

import static configuration.env.CONFIG;

public class CaseSteps {
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    String token;
    String instance_url;
    String caseIdCreated;

    @Before
    public void createToken() {
        ApiRequest localApiRequest = new ApiRequest()
                .baseUri(CONFIG.getProperty("LOGIN"))
                .endpoint(ApiFeature.TOKEN)
                .addParam("password", CONFIG.getProperty("PASSWORD"))
                .addParam("username", CONFIG.getProperty("USER"))
                .addParam("client_id", CONFIG.getProperty("CLIENT_ID"))
                .addParam("client_secret", CONFIG.getProperty("CLIENT_SECRET"))
                .addParam("grant_type", "password")
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .method(ApiMethod.POST);
        ApiResponse apiResponse = ApiManager.execute(localApiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);

        token = apiResponse.getPath("token_type") + " " + apiResponse.getPath("access_token");
        instance_url = apiResponse.getPath("instance_url");
    }

    @Before
    public void setUp() {
        apiRequest = new ApiRequest()
                .baseUri(instance_url + CONFIG.getProperty("SERVICE") + CONFIG.getProperty("VERSION"))
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", token);
        apiRequest.clearPathParam();
    }

    @Before
    public void createCase() throws JsonProcessingException {
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(newCase));
        apiResponse = ApiManager.executeWithBody(apiRequest);
    }

    @Given("I build {string} request")
    public void iBuildRequest(String method) {
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I execute {string} request")
    public void iExecuteRequest(String endpoint) {
        caseIdCreated = apiResponse.getPath("id");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam("caseId", caseIdCreated);
        apiResponse = ApiManager.execute(apiRequest);
    }

    @When("I set update body {string} request")
    public void iExecuteRequestWithBody(String endpoint) throws JsonProcessingException {
        Case updateCase = new Case();
        updateCase.setStatus(CaseEnum.NEW.toStatus());
        caseIdCreated = apiResponse.getPath("id");
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam("caseId", caseIdCreated)
                .setBody(new ObjectMapper().writeValueAsString(updateCase));
        apiResponse = ApiManager.executeWithBody(apiRequest);
    }

    @Then("Status response of request should be added {string}")
    public void theResponseStatusShouldBeOK(String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Then("Status response of request should be updated {string}")
    public void theResponseStatusShouldBe(String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @After
    public void deleteCreatedCase() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", caseIdCreated);
        ApiManager.execute(apiRequest);
    }
}
