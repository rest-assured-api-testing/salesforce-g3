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

/**
 * This enum defines possible SalesForce Endpoints.
 */
public enum ApiEndPoints {

    CASE("/sobjects/Case"),
    CASE_ID("/sobjects/Case/{CASE_ID}"),
    CONTACT("/sobjects/Contact"),
    CONTACT_ID("/sobjects/Contact/{CONTACT_ID}"),
    ACCOUNT("/sobjects/Account"),
    ACCOUNT_ID("/sobjects/Account/{ACCOUNT_ID}"),
    PRODUCT2("/sobjects/Product2"),
    PRODUCT2_ID("/sobjects/Product2/{PRODUCT2_ID}"),
    CAMPAIGN("/sobjects/Campaign"),
    CAMPAIGN_ID("/sobjects/Campaign/{CAMPAIGN_ID}"),
    PRICE_BOOK("/sobjects/PriceBook2"),
    PRICE_BOOK_ID("/sobjects/PriceBook2/{PRICE_BOOK_ID}");

    private String endpoint;

    ApiEndPoints(final String endpoint) {
        this.endpoint = endpoint;
    }
    /**
     * Gets the api end point command according to the Sales force feature.
     *
     * @return the end point.
     */
    public String toEndpoint() {
        return endpoint;
    }
}
