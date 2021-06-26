package api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpHeaders;

import static configuration.env.CONFIG;
import static io.restassured.RestAssured.given;
import static configuration.Authentication.token;

public class ApiManager {

    private static RequestSpecification buildRequest(ApiRequest apiRequest) {
        if (apiRequest.getBaseUri() == null) {
            apiRequest.setBaseUri("");
        }
        return given().baseUri(token.getInstanceUrl() + CONFIG.getProperty("SERVICE") + CONFIG.getProperty("VERSION") + apiRequest.getBaseUri())
                .header(HttpHeaders.AUTHORIZATION, token.getTokenType() + " " + token.getAccessToken())
                .headers(apiRequest.getHeaders())
                .queryParams(apiRequest.getQueryParams())
                .pathParams(apiRequest.getPathParams())
                .params(apiRequest.getParams())
                .log().all();
    }

    public static void execute(ApiRequest apiRequest, ApiResponse apiResponse) {
        Response response;
        if (apiRequest.getBody() != null) {
            response = buildRequest(apiRequest)
                    .body(apiRequest.getBody())
                    .request(apiRequest.getMethod().name()
                            , apiRequest.getEndpoint());
        } else {
            response = buildRequest(apiRequest)
                    .request(apiRequest.getMethod().name()
                            , apiRequest.getEndpoint());
        }
        apiResponse.setResponse(response);
    }
}
