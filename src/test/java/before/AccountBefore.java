package before;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.ApiEndPoints;
import salesforce.entities.Account;
import salesforce.entities.Response;
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
                .endpoint(ApiEndPoints.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @BeforeMethod(onlyForGroups = "CreateDeleteAccount")
    public void beforeCreateAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("Before Account Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @AfterMethod(onlyForGroups = {"CreateDeleteAccount"})
    public void afterDeleteAccount() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.ACCOUNT_ID)
                .addPathParam("ACCOUNT_ID", apiResponse.getBody(Response.class).getId());

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @AfterMethod(onlyForGroups = {"DeleteAccount"})
    public void JustDeleteAccount() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.ACCOUNT_ID)
                .addPathParam("ACCOUNT_ID", apiResponse.getBody(Response.class).getId());

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
}
