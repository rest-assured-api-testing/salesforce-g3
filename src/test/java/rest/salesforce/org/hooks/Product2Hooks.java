package rest.salesforce.org.hooks;

import api.ApiRequest;
import api.ApiResponse;
import api.ApiManager;
import api.ApiMethod;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Product2;
import entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import salesforce.ApiEndPoints;

public class Product2Hooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public Product2Hooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("------ Product2 hook constructor ------");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@UseCreatedProduct2 or @CreateProduct2")
    public void createProduct2() throws JsonProcessingException {
        LOGGER.info("------ Create a product ------");
        Product2 product2 = new Product2();
        product2.setName("Before create product2 cucumber");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.PRODUCT2)
                .body(new ObjectMapper().writeValueAsString(product2));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());
    }

    @After(value = "@UseCreatedProduct2 or @DeleteProduct2")
    public void deleteProduct2() {
        LOGGER.info("------ Delete a product ------");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.PRODUCT2_ID)
                .addPathParam("PRODUCT2_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
