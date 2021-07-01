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
package salesforce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class builds Attributes body.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String url;

    /**
     * Gets the type.
     *
     * @return the type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type to be set.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gets the url.
     *
     * @return the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url to be set.
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
