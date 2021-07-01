package before;

import api.ApiRequest;
import api.ApiResponse;
import configuration.Authentication;
import org.apache.http.HttpHeaders;
import salesforce.entities.CreatedObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static configuration.Authentication.token;
import static configuration.EnvironmentValues.obtainEnvVariables;

public class SuitTestBefore {
    public CreatedObject createdObject;
    public ApiRequest apiRequest;
    public ApiResponse apiResponse;
    public Authentication authentication = new Authentication();

    @BeforeClass
    public void login() {
        authentication.getAuth();
    }

    @BeforeMethod
    public void BeforeRequest() {
        apiRequest = new ApiRequest();
        apiRequest.addHeader("Content-Type", "application/json")
                .addHeader(HttpHeaders.AUTHORIZATION, token.getTokenType() + " " + token.getAccessToken())
                .setBaseUri(token.getInstanceUrl() + obtainEnvVariables("SERVICE")
                        + obtainEnvVariables("VERSION"));
    }

    @AfterClass
    public void AfterRequest() {
        apiRequest = new ApiRequest();
    }
}
