package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
import configuration.Authentication;
import salesforce.entities.Response;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class ScenariosHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    public Authentication authentication = new Authentication();
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public ScenariosHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(order = 0)
    public void loginAndSetup() {
        LOGGER.info("Login Scenarios hook");
        authentication.getAuth();
        apiRequest.addHeader("Content-Type", "application/json");
    }
}
