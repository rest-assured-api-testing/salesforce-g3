package rest.salesforce.org.hooks;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Account;
import entities.Contact;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class AccountHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;

    public AccountHooks(ApiRequest apiRequest, ApiResponse apiResponse) {
        LOGGER.info("--> account hook constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @Before(value =  "@CreateDeleteAccount or @CreateAccount")
    public void createContact() throws JsonProcessingException {
        LOGGER.info("--> Before hook Create a account");

        Account account = new Account();
        account.setName("Before account cucumber");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.ACCOUNT)
                .body(new ObjectMapper().writeValueAsString(account));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @After(value =  "@CreateDeleteAccount or @DeleteAccount")
    public void deleteCreatedContact() {
        LOGGER.info("--> After hook Delete a account");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getPath("id"));
        ApiManager.execute(apiRequest, apiResponse);
    }
}
