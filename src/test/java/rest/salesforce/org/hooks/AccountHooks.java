package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
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

}
