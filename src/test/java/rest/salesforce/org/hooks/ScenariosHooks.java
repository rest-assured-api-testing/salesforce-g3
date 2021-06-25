package rest.salesforce.org.hooks;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import configuration.Authentication;
import entities.Contact;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class ScenariosHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;

    public ScenariosHooks(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @Before(value = "@ShowContactWithId", order = 1)
    public void loginAndSetup() {
        System.out.println("****************** Getting Auth and Token ******************");
        authentication.getAuth();
        apiRequest = new ApiRequest()
                .addHeader("Content-Type", "application/json");
    }

    @Before(value =  "@ShowContactWithId")
    public void createContact() throws JsonProcessingException {
        System.out.println("****************** Creating a new Contact ******************");
        Contact newContact = new Contact();
        newContact.setLastName("New LastName");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @After(value =  "@ShowContactWithId")
    public void deleteCreatedContact() {
        System.out.println("****************** Deleting created Contact ******************");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", apiResponse.getPath("id"));
        ApiManager.execute(apiRequest, apiResponse);
    }
}
