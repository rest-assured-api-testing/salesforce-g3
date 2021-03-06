package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.SuitTestBefore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.ApiEndPoints;
import salesforce.entities.Contact;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ContactTest extends SuitTestBefore {
    String contactCreated;

    @Test
    public void shouldAddNewContact() throws JsonProcessingException {
        Contact newContact = new Contact();
        newContact.setLastName("Perez Pinto");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        contactCreated = apiResponse.getPath("id");
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
        System.out.println(contactCreated);
    }

    @Test
    public void shouldGetAllContacts() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiEndPoints.CONTACT);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldGetAContactById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiEndPoints.CONTACT_ID)
                .addPathParam("CONTACT_ID", contactCreated);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldValidateSchemaOfContactById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiEndPoints.CONTACT_ID)
                .addPathParam("CONTACT_ID", contactCreated);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        apiResponse.validateBodySchema("schemas/contact.json");
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldUpdateAContactById() throws JsonProcessingException {
        Contact contact = new Contact();
        contact.setLastName("Updated LastName");
        contact.setEmail("UpdatedEmail@gmail.com");
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiEndPoints.CONTACT_ID)
                .addPathParam("CONTACT_ID", contactCreated)
                .setBody(new ObjectMapper().writeValueAsString(contact));
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }

    @AfterClass
    public void shouldDeleteAContactById() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.CONTACT_ID)
                .addPathParam("CONTACT_ID", contactCreated);
        ApiResponse apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        apiResponse.getResponse().then().log().body();
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
}
