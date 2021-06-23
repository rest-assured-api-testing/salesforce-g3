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

public class AccountTest extends AccountBefore {

    @Test(groups = {"DeleteAccount"})
    public void createAAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Object Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT.toEndpoint())
                .body(new ObjectMapper().writeValueAsString(account));

        apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateDeleteAccount"})
    public void getAAccount() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.ACCOUNT_ID.toEndpoint())
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateAccount"})
    public void deleteAccount() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID.toEndpoint())
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @Test
    public void getAllAccount() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.ACCOUNT.toEndpoint());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateDeleteAccount"})
    public void UpdateAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Object Updated");
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiFeature.ACCOUNT_ID.toEndpoint())
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId())
                .body(new ObjectMapper().writeValueAsString(account));

        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
}
