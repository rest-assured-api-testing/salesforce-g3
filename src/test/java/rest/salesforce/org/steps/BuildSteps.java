package rest.salesforce.org.steps;

import api.ApiMethod;
import api.ApiRequest;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;

public class BuildSteps {
    private Logger LOGGER = Logger.getLogger(getClass());
    ApiRequest apiRequest;


    public BuildSteps(ApiRequest apiRequest) {
        this.apiRequest = apiRequest;
    }

    @Given("I build {string} request")
    public void iBuildRequest(String method) {
        LOGGER.info("--> Given build step request");
        apiRequest.setMethod(ApiMethod.valueOf(method));
    }
}
