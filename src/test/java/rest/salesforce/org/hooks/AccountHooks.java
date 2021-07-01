package rest.salesforce.org.hooks;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.ApiEndPoints;
import salesforce.entities.Account;
import salesforce.entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class AccountHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public AccountHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("------ Account hook constructor ------");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@UseCreatedAccount or @CreateAccount")
    public void createAccount() throws JsonProcessingException {
        LOGGER.info("------ Create an account ------");
        Account account = new Account();
        account.setName("Before create account cucumber");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    @After(value = "@UseCreatedAccount or @DeleteAccount")
    public void deleteAccount() {
        LOGGER.info("------ Delete an account ------");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.ACCOUNT_ID)
                .addPathParam("ACCOUNT_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
