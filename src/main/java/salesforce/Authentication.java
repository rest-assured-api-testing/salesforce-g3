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
package salesforce;

import salesforce.entities.Token;
import static configuration.EnvironmentValues.obtainEnvVariables;
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
                .param("username", obtainEnvVariables("USER"))
                .param("password", obtainEnvVariables("PASSWORD"))
                .param("client_id", obtainEnvVariables("CLIENT_ID"))
                .param("client_secret", obtainEnvVariables("CLIENT_SECRET"))
                .param("grant_type", "password")
                .header("Accept", "application/json")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .log().all()
                .when().
                        post(obtainEnvVariables("LOGIN"))
                .as(Token.class);
    }
}
