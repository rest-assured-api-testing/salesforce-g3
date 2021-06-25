package before;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import api.*;
import configuration.ApiFeature;
import entities.CreatedObject;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static configuration.env.CONFIG;

public class SuitTestBefore {
    public CreatedObject createdObject;
    public ApiRequest apiRequest;
    public String token;
    public String instance_url;
    public ApiResponse apiResponse;

    @BeforeClass
    public void login() {
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

    @BeforeMethod
    public void BeforeRequest() {
        apiRequest = new ApiRequest()
                .baseUri(instance_url + CONFIG.getProperty("SERVICE") + CONFIG.getProperty("VERSION"))
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", token);
        apiRequest.clearPathParam();
    }

    @AfterClass
    public void AfterRequest() {
        apiRequest = new ApiRequest();
    }
}
