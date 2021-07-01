package before;

import api.ApiRequest;
import api.ApiResponse;
import configuration.Authentication;
import salesforce.entities.CreatedObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


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
        apiRequest = new ApiRequest()
                .addHeader("Content-Type", "application/json");
        apiRequest.clearPathParam();
    }

    @AfterClass
    public void AfterRequest() {
        apiRequest = new ApiRequest();
    }
}
