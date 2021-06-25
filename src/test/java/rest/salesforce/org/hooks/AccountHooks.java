package rest.salesforce.org.hooks;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Account;
import entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class AccountHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;


    public AccountHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("--> account hook constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@CreateDeleteAccount or @CreateAccount")
    public void createContact() throws JsonProcessingException {
        LOGGER.info("--> Before hook Create a account");

        Account account = new Account();
        account.setName("Before account cucumber");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());

    }

    @After(value = "@CreateDeleteAccount or @DeleteAccount")
    public void deleteCreatedContact() {
        LOGGER.info("--> After hook Delete a account");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("ACCOUNT_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
