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

public class CreateSteps {
    public Authentication authentication = new Authentication();
    ApiRequest apiRequest;
    ApiResponse apiResponse;

    @Before
    public void loginAndSetup() {
        authentication.getAuth();
        apiRequest = new ApiRequest()
                .addHeader("Content-Type", "application/json");
    }

    @Given("I build {string} request to create an account")
    public void iBuildRequestToCreateAnAccount(String arg0) {
        apiRequest.setMethod(ApiMethod.valueOf(arg0));
    }

    @When("I execute the request to create the account with the name {string}")
    public void iExecuteTheRequestToCreateTheAccountWithTheName(String arg0) throws JsonProcessingException {
        Account account = new Account();
        account.setName(arg0);
        apiRequest.endpoint(ApiFeature.ACCOUNT)
        .body(new ObjectMapper().writeValueAsString(account));
    }

    @Then("the response status code should be account created {string}")
    public void theResponseStatusCodeShouldBeAccountCreated(String arg0) {
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
    @After(value = "@CreateAccount")
    public void cleanCreatedAccount(){
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.ACCOUNT_ID)
                .addPathParam("accountId", apiResponse.getBody(Response.class).getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }

    @Given("I build {string} request request to create a Campaign")
    public void iBuildRequestRequestToCreateACampaign(String arg0) {
        apiRequest.setMethod(ApiMethod.valueOf(arg0));
    }

    @When("I execute the request to create the campaign with the name {string}")
    public void iExecuteTheRequestToCreateTheCampaignWithTheName(String arg0) throws JsonProcessingException {
        Campaign campaign = new Campaign();
        campaign.setName(arg0);
        apiRequest.endpoint(ApiFeature.CAMPAIGN)
                .body(new ObjectMapper().writeValueAsString(campaign));
    }

    @Then("the response status code should be campaign created {string}")
    public void theResponseStatusCodeShouldBeCampaignCreated(String arg0) {
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
    @After(value = "@CreateCampaign")
    public void cleanCreatedCampaign(){
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CAMPAIGN_ID)
                .addPathParam("campaignId", apiResponse.getBody(Response.class).getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
    @Given("I build {string} request request to create a pricebook")
    public void iBuildRequestRequestToCreateAPricebook(String arg0) {
        apiRequest.setMethod(ApiMethod.valueOf(arg0));
    }

    @When("I execute the request to create the pricebook with the name {string}")
    public void iExecuteTheRequestToCreateThePricebookWithTheName(String arg0) throws JsonProcessingException {
        PriceBook priceBook = new PriceBook();
        priceBook.setName(arg0);
        apiRequest.endpoint(ApiFeature.PRICE_BOOK)
                .body(new ObjectMapper().writeValueAsString(priceBook));
    }

    @Then("the response status code should be pricebook created {string}")
    public void theResponseStatusCodeShouldBePricebookCreated(String arg0) {
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
    @After(value = "@CreatePriceBook")
    public void cleanCreatedPriceBook(){
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.PRICE_BOOK_ID)
                .addPathParam("priceId", apiResponse.getBody(Response.class).getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
    @Given("I build {string} request request to create a Product{int}")
    public void iBuildRequestRequestToCreateAProduct(String arg0, int arg1) {
        apiRequest.setMethod(ApiMethod.valueOf(arg0));
    }

    @When("I execute the request to create the Product{int} with the name {string}")
    public void iExecuteTheRequestToCreateTheProductWithTheName(int arg0, String arg1) throws JsonProcessingException {
        Product2 product2 = new Product2();
        product2.setName(arg1);
        apiRequest.endpoint(ApiFeature.PRODUCT2)
                .body(new ObjectMapper().writeValueAsString(product2));
    }
    @Then("the response status code should be Product{int} created {string}")
    public void theResponseStatusCodeShouldBeProductCreated(int arg0, String arg1) {
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
    @After(value = "@CreateProduct2")
    public void cleanCreatedProduct2(){
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.PRODUCT2_ID)
                .addPathParam("product2Id", apiResponse.getBody(Response.class).getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
    @Given("I build {string} request request to create a Contact")
    public void iBuildRequestRequestToCreateAContact(String arg0) {
        apiRequest.setMethod(ApiMethod.valueOf(arg0));
    }

    @When("I execute the request to create the Contact with the name {string}")
    public void iExecuteTheRequestToCreateTheContactWithTheName(String arg0) throws JsonProcessingException {
        Contact contact = new Contact();
        contact.setLastName(arg0);
        apiRequest.endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(contact));
    }

    @Then("the response status code should be Contact created {string}")
    public void theResponseStatusCodeShouldBeContactCreated(String arg0) {
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
    @After(value = "@CreateContact")
    public void cleanCreatedContact(){
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", apiResponse.getBody(Response.class).getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
    @Given("I build {string} request request to create a Case")
    public void iBuildRequestRequestToCreateACase(String arg0) {
        apiRequest.setMethod(ApiMethod.valueOf(arg0));
    }

    @When("I execute the request to create the Case with the name {string}")
    public void iExecuteTheRequestToCreateTheCaseWithTheName(String arg0) throws JsonProcessingException {
        Case aCase = new Case();
        aCase.setStatus(CaseEnum.WORKING.toStatus());
        apiRequest.endpoint(ApiFeature.CASES)
                .body(new ObjectMapper().writeValueAsString(aCase));
    }

    @Then("the response status code should be Case created {string}")
    public void theResponseStatusCodeShouldBeCaseCreated(String arg0) {
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
    @After(value = "@CreateCase")
    public void cleanCreatedCase(){
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CASES_ID)
                .addPathParam("caseId", apiResponse.getBody(Response.class).getId());
        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
}
