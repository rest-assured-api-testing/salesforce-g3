package before;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Account;
import entities.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AccountBefore extends SuitTestBefore {

    @BeforeMethod(onlyForGroups = "CreateAccount")
    public void JustCreateAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Before Account Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @BeforeMethod(onlyForGroups = "CreateDeleteAccount")
    public void beforeCreateAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Before Account Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @AfterMethod(onlyForGroups = {"CreateDeleteAccount"})
    public void afterDeleteAccount() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @AfterMethod(onlyForGroups = {"DeleteAccount"})
    public void JustDeleteAccount() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
}
