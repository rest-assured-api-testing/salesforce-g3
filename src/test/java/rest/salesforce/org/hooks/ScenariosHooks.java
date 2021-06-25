package rest.salesforce.org.hooks;

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
import org.apache.http.HttpStatus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import static configuration.env.CONFIG;

public class ScenariosHooks {
    private static final Logger LOGGER = LogManager.getLogger();
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private String token;
    private String instance_url;

    public ScenariosHooks(ApiRequest apiRequest, ApiResponse apiResponse) {
        LOGGER.info("Testing ScenarioHooks constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @Before
    public void createToken() {
        LOGGER.info("**************** Generating Token ****************");
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
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(localApiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);

        token = apiResponse.getPath("token_type") + " " + apiResponse.getPath("access_token");
        instance_url = apiResponse.getPath("instance_url");
    }

    @Before
    public void setUp() {
        LOGGER.info("**************** Setting Token ****************");
        apiRequest = new ApiRequest()
                .baseUri(instance_url + CONFIG.getProperty("SERVICE") + CONFIG.getProperty("VERSION"))
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", token);
        apiRequest.clearPathParam();
    }

    @Before(value =  "@ShowCaseWithId")
    public void createCase() throws JsonProcessingException {
        LOGGER.info("**************** Creating Case ****************");
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(newCase));
        ApiManager.executeWithBody(apiRequest, apiResponse);
    }

    @After(value =  "@ShowCaseWithId")
    public void deleteCreatedCase() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", apiResponse.getPath("id"));
        ApiManager.executeWithBody(apiRequest, apiResponse);
    }
}
