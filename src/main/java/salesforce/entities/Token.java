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
package salesforce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class defines an authentication token schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Token {
    public String accessToken;
    private String instanceUrl;
    private String id;
    private String tokenType;
    private String issuedAt;
    private String signature;

    /**
     * Gets the accessToken.
     *
     * @return the accessToken.
     */
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }
    /**
     * Sets the accessToken.
     *
     * @param accessToken to be set.
     */
    @JsonProperty("access_token")
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }
    /**
     * Gets the instanceUrl.
     *
     * @return the instanceUrl.
     */
    @JsonProperty("instance_url")
    public String getInstanceUrl() {
        return instanceUrl;
    }
    /**
     * Sets the instanceUrl.
     *
     * @param instanceUrl to be set.
     */
    @JsonProperty("instance_url")
    public void setInstanceUrl(final String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }
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
     * Gets the tokenType.
     *
     * @return the tokenType.
     */
    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }
    /**
     * Sets the tokenType.
     *
     * @param tokenType to be set.
     */
    @JsonProperty("token_type")
    public void setTokenType(final String tokenType) {
        this.tokenType = tokenType;
    }
    /**
     * Gets the issuedAt.
     *
     * @return the issuedAt.
     */
    @JsonProperty("issued_at")
    public String getIssuedAt() {
        return issuedAt;
    }
    /**
     * Sets the issuedAt.
     *
     * @param issuedAt to be set.
     */
    @JsonProperty("issued_at")
    public void setIssuedAt(final String issuedAt) {
        this.issuedAt = issuedAt;
    }
    /**
     * Gets the signature.
     *
     * @return the signature.
     */
    public String getSignature() {
        return signature;
    }
    /**
     * Sets the signature.
     *
     * @param signature to be set.
     */
    public void setSignature(final String signature) {
        this.signature = signature;
    }
}
