package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import configuration.Authentication;
import entities.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.testng.Assert;

public class UpdateSteps {
    ApiRequest apiRequest;
    ApiResponse apiResponse = new ApiResponse();
    String createdId;
    public Authentication authentication = new Authentication();

    @Before(order = 1)
    public void loginAndSetup() {
        authentication.getAuth();
        apiRequest = new ApiRequest()
                .addHeader("Content-Type", "application/json");
    }

    @Before(value = "@UpdateCase")
    public void createCase() throws JsonProcessingException {
        Case newCase = new Case();
        newCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(newCase));
        ApiManager.execute(apiRequest, apiResponse);
        createdId = apiResponse.getPath("id");
    }

    @After(value = "@UpdateCase")
    public void deleteCreatedCase() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", createdId);
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Before(value = "@UpdateContact")
    public void createContact() throws JsonProcessingException {
        Contact newContact = new Contact();
        newContact.setLastName("Perez Pinto");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));
        ApiManager.execute(apiRequest, apiResponse);
        createdId = apiResponse.getPath("id");
    }

    @After(value = "@UpdateContact")
    public void deleteCreatedContact() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", createdId);
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Before(value = "@UpdateCampaign")
    public void createCampaign() throws JsonProcessingException {
        Campaign newCampaign = new Campaign();
        newCampaign.setName("Name campaign");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CAMPAIGN)
                .body(new ObjectMapper().writeValueAsString(newCampaign));
        ApiManager.execute(apiRequest, apiResponse);
        createdId = apiResponse.getPath("id");
    }

    @After(value = "@UpdateCampaign")
    public void deleteCreatedCampaign() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CAMPAIGN_ID)
                .addPathParam("campaignId", createdId);
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Before(value = "@UpdatePriceBook")
    public void createPriceBook() throws JsonProcessingException {
        PriceBook newPriceBook = new PriceBook();
        newPriceBook.setName("New pricebook name");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.PRICE_BOOK)
                .body(new ObjectMapper().writeValueAsString(newPriceBook));
        ApiManager.execute(apiRequest, apiResponse);
        createdId = apiResponse.getPath("id");
    }

    @After(value = "@UpdatePriceBook")
    public void deleteCreatedPriceBook() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.PRICE_BOOK_ID)
                .addPathParam("priceId", createdId);
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Given("I build a {string} request")
    public void iBuildRequest(String method) {
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I set update case {string}  with {string} request")
    public void iExecuteRequestWithBodyCase(String endpoint, String objectId) throws JsonProcessingException {
        Case updateCase = new Case();
        updateCase.setStatus(CaseEnum.NEW.toStatus());
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(objectId, createdId)
                .setBody(new ObjectMapper().writeValueAsString(updateCase));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I set update contact {string}  with {string} request")
    public void iExecuteRequestWithBodyContact(String endpoint, String objectId) throws JsonProcessingException {
        Contact updateContact = new Contact();
        updateContact.setLastName("updatedLastName");
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(objectId, createdId)
                .setBody(new ObjectMapper().writeValueAsString(updateContact));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I set update campaign ")
    public void iExecuteRequestWithBodyCampaign(String endpoint, String objectId) throws JsonProcessingException {
        Campaign updateCampaign = new Campaign();
        updateCampaign.setName("New updated Name campaign");
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(objectId, createdId)
                .setBody(new ObjectMapper().writeValueAsString(updateCampaign));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @When("I set update pricebook {string}  with {string} request")
    public void iExecuteRequestWithBodyPriceBook(String endpoint, String objectId) throws JsonProcessingException {
        PriceBook updatePriceBook = new PriceBook();
        updatePriceBook.setName("New updated Name campaign");
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam(objectId, createdId)
                .setBody(new ObjectMapper().writeValueAsString(updatePriceBook));
        ApiManager.execute(apiRequest, apiResponse);
    }

    @Then("Status response of request should be updated {string}")
    public void theResponseStatusShouldBe(String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
}
