package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.SuitTestBefore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Contact;
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
                .endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));
        ApiResponse response = ApiManager.executeWithBody(apiRequest);
        contactCreated = response.getPath("id");
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
        response.getResponse().then().log().body();
        System.out.println(contactCreated);
    }

    @Test
    public void shouldGetAllContacts() {
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CONTACT);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldGetAContactById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", contactCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldValidateSchemaOfContactById() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", contactCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        response.validateBodySchema("schemas/contact.json");
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }

    @Test
    public void shouldUpdateAContactById() throws JsonProcessingException {
        Contact contact = new Contact();
        contact.setLastName("Updated LastName");
        contact.setEmail("UpdatedEmail@gmail.com");
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", contactCreated)
                .setBody(new ObjectMapper().writeValueAsString(contact));
        ApiResponse response = ApiManager.executeWithBody(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }

    @AfterClass
    public void shouldDeleteAContactById() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.CONTACT_ID)
                .addPathParam("contactId", contactCreated);
        ApiResponse response = ApiManager.execute(apiRequest);
        response.getResponse().then().log().body();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
}
