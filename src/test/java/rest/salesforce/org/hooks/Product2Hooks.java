package rest.salesforce.org.hooks;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import api.ApiFeature;
import entities.Product2;
import entities.Response;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class Product2Hooks {
    private Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequest apiRequest;
    private ApiResponse apiResponse;
    private Response response;

    public Product2Hooks(ApiRequest apiRequest, ApiResponse apiResponse, Response response) {
        LOGGER.info("--> product2 hook constructor");
        this.apiRequest = apiRequest;
        this.apiResponse = apiResponse;
        this.response = response;
    }

    @Before(value = "@CreateDeleteProduct2 or @CreateProduct2")
    public void create() throws JsonProcessingException {
        LOGGER.info("--> Before hook Create a product2");
        Product2 product2 = new Product2();
        product2.setName("Before create product2 cucumber");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.PRODUCT2)
                .body(new ObjectMapper().writeValueAsString(product2));
        ApiManager.execute(apiRequest, apiResponse);
        response.setId(apiResponse.getBody(Response.class).getId());

    }

    @After(value = "@CreateDeleteProduct2 or @DeleteProduct2")
    public void delete() {
        LOGGER.info("--> After delete product2 cucumber");
        apiRequest.clearPathParam();
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.PRODUCT2_ID)
                .addPathParam("PRODUCT2_ID", response.getId());
        ApiManager.execute(apiRequest, apiResponse);
    }
}
