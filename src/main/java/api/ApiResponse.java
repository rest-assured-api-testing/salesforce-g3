/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Edson Añawaya Rios
 */
package api;

import io.restassured.response.Response;

import java.util.List;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * This class builds an api response.
 */
public class ApiResponse {
    private Response response;

    public ApiResponse(final Response response) {
        this.response = response;
    }

    public ApiResponse() {
    }

    /**
     * Gets the api response.
     *
     * @return the response.
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the response.
     *
     * @param response to be set.
     */
    public void setResponse(final Response response) {
        this.response = response;
    }

    /**
     * Gets the api Status Code.
     *
     * @return the Status Code.
     */
    public int getStatusCode() {
        return response.getStatusCode();
    }

    /**
     * Gets the api body.
     *
     * @return the body.
     * @param cls to ge the body.
     * @param <T> class type to get the body.
     */
    public <T> T getBody(final Class<T> cls) {
        return response.getBody().as(cls);
    }

    /**
     * Gets the api body list.
     *
     * @return the body list.
     * @param cls to ge the body list.
     * @param <T> class type to get the body list.
     */
    public <T> List getBodyList(final Class<T> cls) {
        return response.getBody().jsonPath().getList("", cls);
    }

    /**
     * Gets the api path.
     *
     * @return the path.
     * @param path of the value to be get.
     */
    public String getPath(final String path) {
        return response.getBody().jsonPath().getJsonObject(path);
    }

    /**
     * Validates a json Schema.
     *
     * @param schema of the value to be validated.
     */
    public void validateBodySchema(final String schema) {
        response.then().log().body().assertThat().body(matchesJsonSchemaInClasspath(schema));
    }
}
