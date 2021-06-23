package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.Product2Before;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import configuration.ApiFeature;
import entities.Product2;
import entities.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Product2Test extends Product2Before {

    @Test
    public void getAllProduct2() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.PRODUCT2);

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateDeleteProduct2"})
    public void getProduct2() {
        apiRequest.method(ApiMethod.GET)
                .endpoint(ApiFeature.PRODUCT2_ID)
                .addPathParam("product2Id", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"DeleteProduct2"})
    public void createAProduct2() throws JsonProcessingException {
        Product2 product2 = new Product2();
        product2.setName("Object Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.PRODUCT2)
                .body(new ObjectMapper().writeValueAsString(product2));

        apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateProduct2"})
    public void deleteProduct2() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiFeature.PRODUCT2_ID)
                .addPathParam("product2Id", apiResponse.getBody(Response.class).getId());

        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @Test(groups = {"CreateDeleteProduct2"})
    public void UpdateProduct2() throws JsonProcessingException {
        Product2 product2 = new Product2();
        product2.setName("Product2 Updated");
        apiRequest.method(ApiMethod.PATCH)
                .endpoint(ApiFeature.PRODUCT2_ID)
                .addPathParam("product2Id", apiResponse.getBody(Response.class).getId())
                .body(new ObjectMapper().writeValueAsString(product2));

        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
}
