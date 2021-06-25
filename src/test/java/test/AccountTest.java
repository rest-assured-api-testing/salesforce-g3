package test;

import configuration.ApiFeature;
import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.AccountBefore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import entities.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends AccountBefore {/*

    @Test
    public void getAllAccount() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.ACCOUNT);

        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateDeleteAccount"})
    public void getAccount() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"DeleteAccount"})
    public void createAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Object Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateAccount"})
    public void deleteAccount() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateDeleteAccount"})
    public void UpdateAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Object Updated");
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId())
                .body(new ObjectMapper().writeValueAsString(account));

        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }*/
}
