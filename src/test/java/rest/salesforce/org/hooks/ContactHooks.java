package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
import api.ApiManager;
import api.ApiMethod;
import api.ApiFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Contact;
import entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class ContactHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public ContactHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("------ Contact hook constructor ------");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }
    @Before(value = "@UpdateContact")
    public void createContact() throws JsonProcessingException {
        LOGGER.info("------ Create a contact ------");
        Contact newContact = new Contact();
        newContact.setLastName("New LastName");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    @After(value = "@UpdateContact or @CreateAContact")
    public void deleteContact() {
        LOGGER.info("------ After delete created case ------");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("CONTACT_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
