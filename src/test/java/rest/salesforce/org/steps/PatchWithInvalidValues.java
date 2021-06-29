package rest.salesforce.org.steps;

import salesforce.ApiEndPoints;
import api.ApiManager;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.InvalidIDs;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class PatchWithInvalidValues {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;

    public PatchWithInvalidValues(ApiRequest apiRequest, ApiResponse apiResponse) {
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
    }

    @When("I execute patch {string} with an {string} request")
    public void iExecutePatchWithAnRequest(String endpoint, String ID, DataTable jsonData) throws JsonProcessingException {
        LOGGER.info("------ Execute Delete an object ------");
        String body = new ObjectMapper().writeValueAsString(jsonData.asMap(String.class, String.class));
        apiRequest.endpoint(ApiEndPoints.valueOf(endpoint))
                .addPathParam(endpoint, InvalidIDs.valueOf(ID).value())
                .body(body);
        ApiManager.execute(apiRequest, apiResponse);
    }
}
