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
package entities;

import java.util.List;

/**
 * This class defines a created object response.
 */
public class Response {
    public String id;
    public boolean success;
    public List<Object> errors;

    /**
     * Gets the id.
     *
     * @return the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id to be set.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets the success.
     *
     * @return the success.
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the success.
     *
     * @param success to be set.
     */
    public void setSuccess(final boolean success) {
        this.success = success;
    }

    /**
     * Gets the errors.
     *
     * @return the errors.
     */
    public List<Object> getErrors() {
        return errors;
    }

    /**
     * Sets the errors.
     *
     * @param errors to be set.
     */
    public void setErrors(final List<Object> errors) {
        this.errors = errors;
    }
}
