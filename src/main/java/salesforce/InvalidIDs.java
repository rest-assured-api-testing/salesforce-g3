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
package salesforce;

/**
 * This enum defines Invalid IDs for salesforce Endopints.
 */
public enum InvalidIDs {

    INVALID_CASE_ID("abcd1234"),
    INVALID_CONTACT_ID("abcd1234"),
    INVALID_ACCOUNT_ID("abcd1234"),
    INVALID_PRODUCT2_ID("abcd1234"),
    INVALID_CAMPAIGN_ID("abcd1234"),
    INVALID_PRICE_BOOK_ID("abcd1234");

    private String id;

    InvalidIDs(final String  responseCode) {
        this.id = responseCode;
    }
    /**
     * Gets the api invalid ID according to the Sales force feature.
     *
     * @return the ID.
     */
    public String value() {
        return id;
    }
}
