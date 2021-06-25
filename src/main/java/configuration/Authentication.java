package configuration;

import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import entities.Token;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.testng.Assert;

import static configuration.env.CONFIG;
import static io.restassured.RestAssured.given;

public class Authentication {
    public static Token token;

    public void getAuth() {
        token = given().urlEncodingEnabled(true)
                .param("username", CONFIG.getProperty("USER"))
                .param("password", CONFIG.getProperty("PASSWORD"))
                .param("client_id", CONFIG.getProperty("CLIENT_ID"))
                .param("client_secret", CONFIG.getProperty("CLIENT_SECRET"))
                .param("grant_type", "password")
                .header("Accept", "application/json")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .log().all()
                .when().
                        post(CONFIG.getProperty("LOGIN"))
                .as(Token.class);
    }
}
