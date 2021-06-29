/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Edson Anawaya Rios
 */
package configuration;

import entities.Token;
import static configuration.Env.CONFIG;
import static io.restassured.RestAssured.given;

/**
 * This class builds a token.
 */
public class Authentication {

    public static Token token;

    /**
     * Sets the salesforce token.
     */
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
