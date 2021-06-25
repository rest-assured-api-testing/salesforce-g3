package configuration;

import entities.Token;

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
