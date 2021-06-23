package Tests;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.BeforeClasses;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Account;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTest extends BeforeClasses {

    @Test(groups = "Account")
    public void addAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("ObjectTest5");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));

        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

}
