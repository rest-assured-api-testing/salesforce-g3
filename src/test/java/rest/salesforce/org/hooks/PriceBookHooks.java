package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
import api.ApiManager;
import api.ApiMethod;
import salesforce.ApiEndPoints;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.entities.PriceBook;
import salesforce.entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class PriceBookHooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public PriceBookHooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("------ PriceBook hook constructor ------");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@UseCreatedPrice or @CreatePrice")
    public void createPriceBook() throws JsonProcessingException {
        LOGGER.info("------ Create a price book ------");
        PriceBook newPriceBook = new PriceBook();
        newPriceBook.setName("New PriceBook name");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.PRICE_BOOK)
                .body(new ObjectMapper().writeValueAsString(newPriceBook));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    @After(value = "@UseCreatedPrice or @DeletePrice")
    public void deletePriceBook() {
        LOGGER.info("------ After delete created price book ------");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.PRICE_BOOK_ID)
                .addPathParam("PRICE_BOOK_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
