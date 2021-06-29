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

/**
 * This enum defines Invalid IDs for salesforce Endopints.
 */
public enum ApiStatusCode {

    OK(200),
    CREATED(201),
    NO_CONTENT(204),
    BAD_REQUEST(400),
    NOT_FOUND(404),
    SERVER_ERROR(500),
    NOT_ALLOWED(405);

    private int responseCode;

    ApiStatusCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public int value() {
        return responseCode;
    }
}
