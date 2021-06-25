package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.ApiFeature;
import entities.Contact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class ContactSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    String contactIdCreated;

    public ContactSteps(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiResponse = apiResponse;
        this.apiRequest = apiRequest;
    }

    @Given("I build a {string} request")
    public void iBuildRequest(String method) {
        LOGGER.info("--> Given contact iBuildRequest");
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I execute for contact {string} request")
    public void iExecuteRequest(String endpoint) {
        LOGGER.info("--> When contact Execute the show by id");
        contactIdCreated = apiResponse.getPath("id");
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam("contactId", contactIdCreated);
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I update body {string} request")
    public void iExecuteRequestWithBody(String endpoint) throws JsonProcessingException {
        LOGGER.info("--> When contact iExecuteRequestWithBody");
        Contact updateContact = new Contact();
        updateContact.setLastName("New LastName");
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam("contactId", contactIdCreated)
                .setBody(new ObjectMapper().writeValueAsString(updateContact));
        ApiManager.execute(apiRequest, apiResponse);
    }
}
