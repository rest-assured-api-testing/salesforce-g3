package rest.salesforce.org.steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Contact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpStatus;
import org.testng.Assert;

public class CaseSteps {
    ApiRequest apiRequest;
    ApiResponse apiResponse;
    String createdId;

    public CaseSteps(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiResponse = apiResponse;
        this.apiRequest = apiRequest;
        createdId = apiResponse.getPath("id");
    }
}
