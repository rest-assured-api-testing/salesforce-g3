package test;

import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import before.BeforePriceBook;
import configuration.ApiFeature;
import entities.CreatedObject;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriceBookTest extends BeforePriceBook {/*
    @Test
    public void createAPriceBook() {
        apiRequest.setEndpoint(ApiFeature.PRICE_BOOK);
        apiRequest.setBody("{\"Name\":\"Test pricebook4\"}");
        apiRequest.setMethod(ApiMethod.POST);
        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        createdObject = apiResponse.getBody(CreatedObject.class);
        apiResponse.validateBodySchema("schemas/createdobject.json");
        int expected = HttpStatus.SC_CREATED;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnBadForUpdateWithInvalidPriceBookID() {
        apiRequest.setEndpoint(ApiFeature.PRICE_BOOK_ID);
        apiRequest.addPathParam("priceId", "01s5e000007oCh5AAE");
        apiRequest.setBody("{\"Name\":\"UpdatedName\"}");
        apiRequest.setMethod(ApiMethod.PATCH);
        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        int expected = HttpStatus.SC_BAD_REQUEST;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNotFoundForGetWithInvalidPriceBookID() {
        apiRequest.setEndpoint(ApiFeature.PRICE_BOOK_ID);
        apiRequest.addPathParam("priceId", "01s5e000007oCh5AAE");
        apiRequest.setMethod(ApiMethod.GET);
        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        int expected = HttpStatus.SC_NOT_FOUND;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnNotFoundForDeleteInvalidPriceBookID() {
        apiRequest.setEndpoint(ApiFeature.PRICE_BOOK_ID);
        apiRequest.addPathParam("priceId", "01s5e000007oCh5AAE");
        apiRequest.setMethod(ApiMethod.DELETE);
        ApiResponse apiResponse = ApiManager.execute(apiRequest);
        int expected = HttpStatus.SC_NOT_FOUND;
        int actual = apiResponse.getStatusCode();
        Assert.assertEquals(actual, expected);
    }*/
}
