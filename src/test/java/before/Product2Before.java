package before;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import salesforce.ApiEndPoints;
import salesforce.entities.Product2;
import salesforce.entities.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Product2Before extends SuitTestBefore {
    @BeforeMethod(onlyForGroups = "CreateProduct2")
    public void JustCreateProduct2() throws JsonProcessingException {
        Product2 product2 = new Product2();
        product2.setName("Before Product Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.PRODUCT2)
                .body(new ObjectMapper().writeValueAsString(product2));

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @BeforeMethod(onlyForGroups = "CreateDeleteProduct2")
    public void beforeCreateProduct2() throws JsonProcessingException {
        Product2 product2 = new Product2();
        product2.setName("Before Product Test");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiEndPoints.PRODUCT2)
                .body(new ObjectMapper().writeValueAsString(product2));

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }

    @AfterMethod(onlyForGroups = {"CreateDeleteProduct2"})
    public void afterDeleteProduct2() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.PRODUCT2_ID)
                .addPathParam("PRODUCT2_ID", apiResponse.getBody(Response.class).getId());

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }

    @AfterMethod(onlyForGroups = {"DeleteProduct2"})
    public void JustDeleteProduct2() {
        apiRequest.method(ApiMethod.DELETE)
                .endpoint(ApiEndPoints.PRODUCT2_ID)
                .addPathParam("PRODUCT2_ID", apiResponse.getBody(Response.class).getId());

        apiResponse = new ApiResponse();
        ApiManager.execute(apiRequest, apiResponse);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_NO_CONTENT);
        apiResponse.getResponse().then().log().body();
    }
}
