/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Jorge Rodrigo Cáceres Velasco
 */
package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * This class defines valid status for a created object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedObject {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Id;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean success;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private List<String> errors;

    /**
     * Gets the Id.
     *
     * @return the Id.
     */
    public String getId() {
        return Id;
    }
    /**
     * Sets the id.
     *
     * @param id to be set.
     */
    public void setId(final String id) {
        Id = id;
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
    public List<String> getErrors() {
        return errors;
    }
    /**
     * Sets the errors.
     *
     * @param errors to be set.
     */
    public void setErrors(final List<String> errors) {
        this.errors = errors;
    }
}
