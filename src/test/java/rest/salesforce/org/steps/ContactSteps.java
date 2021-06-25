package rest.salesforce.org.steps;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Contact;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.testng.Assert;

import static configuration.env.CONFIG;

public class ContactSteps { /*
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    String token;
    String instance_url;
    String contactIdCreated;

    @Before
    public void createToken() {
        ApiRequest localApiRequest = new ApiRequest()
                .baseUri(CONFIG.getProperty("LOGIN"))
                .endpoint(ApiFeature.TOKEN)
                .addParam("password", CONFIG.getProperty("PASSWORD"))
                .addParam("username", CONFIG.getProperty("USER"))
                .addParam("client_id", CONFIG.getProperty("CLIENT_ID"))
                .addParam("client_secret", CONFIG.getProperty("CLIENT_SECRET"))
                .addParam("grant_type", "password")
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .method(ApiMethod.POST);
        ApiResponse apiResponse = ApiManager.execute(localApiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);

        token = apiResponse.getPath("token_type") + " " + apiResponse.getPath("access_token");
        instance_url = apiResponse.getPath("instance_url");
    }

    @Before
    public void setUp() {
        apiRequest = new ApiRequest()
                .baseUri(instance_url + CONFIG.getProperty("SERVICE") + CONFIG.getProperty("VERSION"))
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", token);
        apiRequest.clearPathParam();
    }

    @Before
    public void createContact() throws JsonProcessingException {
        Contact newContact = new Contact();
        newContact.setLastName("Perez Pinto");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));
        apiResponse = ApiManager.executeWithBody(apiRequest);
        contactIdCreated = apiResponse.getPath("id");
    }

    @Given("I build a {string} request")
    public void iBuildRequest(String method) {
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }

    @When("I execute for contact {string} request")
    public void iExecuteRequest(String endpoint) {
        apiRequest.setEndpoint(ApiFeature.valueOf(endpoint));
        apiRequest.addPathParam("contactId", contactIdCreated);
        apiResponse = ApiManager.execute(apiRequest);
    }

    @When("I update body {string} request")
    public void iExecuteRequestWithBody(String endpoint) throws JsonProcessingException {
        Contact updateContact = new Contact();
        updateContact.setLastName("New LastName");
        apiRequest.endpoint(ApiFeature.valueOf(endpoint))
                .addPathParam("contactId", contactIdCreated)
                .setBody(new ObjectMapper().writeValueAsString(updateContact));
        apiResponse = ApiManager.executeWithBody(apiRequest);
    }

    @Then("Status response of request should be {string}")
    public void theResponseStatusShouldBeOK(String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Then("Status response of request should be like {string}")
    public void theResponseStatusShouldBe(String statusCode) {
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }


    @After
    public void shouldDeleteAContactById() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", contactIdCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
    */
}
