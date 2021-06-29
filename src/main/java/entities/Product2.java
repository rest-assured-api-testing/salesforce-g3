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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * This class defines a product.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product2 {

    public Attributes attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ProductCode")
    public String productCode;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("CreatedDate")
    public Date createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("SystemModstamp")
    public Date systemModstamp;
    @JsonProperty("Family")
    public String family;
    @JsonProperty("ExternalDataSourceId")
    public String externalDataSourceId;
    @JsonProperty("ExternalId")
    public String externalId;
    @JsonProperty("DisplayUrl")
    public String displayUrl;
    @JsonProperty("QuantityUnitOfMeasure")
    public String quantityUnitOfMeasure;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("IsArchived")
    public Boolean isArchived;
    @JsonProperty("LastViewedDate")
    public String lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public String lastReferencedDate;
    @JsonProperty("StockKeepingUnit")
    public String stockKeepingUnit;

    /**
     * Gets the attributes.
     *
     * @return the attributes.
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes.
     *
     * @param attributes to be set.
     */
    public void setAttributes(final Attributes attributes) {
        this.attributes = attributes;
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
     * Gets the name.
     *
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name to be set.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the productCode.
     *
     * @return the productCode.
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the productCode.
     *
     * @param productCode to be set.
     */
    public void setProductCode(final String productCode) {
        this.productCode = productCode;
    }

    /**
     * Gets the description.
     *
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description to be set.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets the isActive.
     *
     * @return the isActive.
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * Sets the active.
     *
     * @param active to be set.
     */
    public void setActive(final Boolean active) {
        isActive = active;
    }

    /**
     * Gets the createdDate.
     *
     * @return the createdDate.
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the createdDate.
     *
     * @param createdDate to be set.
     */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets the createdById.
     *
     * @return the createdById.
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the createdById.
     *
     * @param createdById to be set.
     */
    public void setCreatedById(final String createdById) {
        this.createdById = createdById;
    }

    /**
     * Gets the lastModifiedDate.
     *
     * @return the lastModifiedDate.
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the lastModifiedDate.
     *
     * @param lastModifiedDate to be set.
     */
    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets the lastModifiedById.
     *
     * @return the lastModifiedById.
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the lastModifiedById.
     *
     * @param lastModifiedById to be set.
     */
    public void setLastModifiedById(final String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    /**
     * Gets the systemModstamp.
     *
     * @return the systemModstamp.
     */
    public Date getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the systemModstamp.
     *
     * @param systemModstamp to be set.
     */
    public void setSystemModstamp(final Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    /**
     * Gets the family.
     *
     * @return the family.
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the family.
     *
     * @param family to be set.
     */
    public void setFamily(final String family) {
        this.family = family;
    }

    /**
     * Gets the externalDataSourceId.
     *
     * @return the externalDataSourceId.
     */
    public String getExternalDataSourceId() {
        return externalDataSourceId;
    }

    /**
     * Sets the externalDataSourceId.
     *
     * @param externalDataSourceId to be set.
     */
    public void setExternalDataSourceId(final String externalDataSourceId) {
        this.externalDataSourceId = externalDataSourceId;
    }

    /**
     * Gets the externalId.
     *
     * @return the externalId.
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the externalId.
     *
     * @param externalId to be set.
     */
    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    /**
     * Gets the displayUrl.
     *
     * @return the displayUrl.
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the displayUrl.
     *
     * @param displayUrl to be set.
     */
    public void setDisplayUrl(final String displayUrl) {
        this.displayUrl = displayUrl;
    }

    /**
     * Gets the quantityUnitOfMeasure.
     *
     * @return the quantityUnitOfMeasure.
     */
    public String getQuantityUnitOfMeasure() {
        return quantityUnitOfMeasure;
    }

    /**
     * Sets the quantityUnitOfMeasure.
     *
     * @param quantityUnitOfMeasure to be set.
     */
    public void setQuantityUnitOfMeasure(final String quantityUnitOfMeasure) {
        this.quantityUnitOfMeasure = quantityUnitOfMeasure;
    }

    /**
     * Gets the isDeleted.
     *
     * @return the isDeleted.
     */
    public Boolean getDeleted() {
        return isDeleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted to be set.
     */
    public void setDeleted(final Boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * Gets the isArchived.
     *
     * @return the isArchived.
     */
    public Boolean getArchived() {
        return isArchived;
    }

    /**
     * Sets the archived.
     *
     * @param archived to be set.
     */
    public void setArchived(final Boolean archived) {
        isArchived = archived;
    }

    /**
     * Gets the lastViewedDate.
     *
     * @return the lastViewedDate.
     */
    public String getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the lastViewedDate.
     *
     * @param lastViewedDate to be set.
     */
    public void setLastViewedDate(final String lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets the lastReferencedDate.
     *
     * @return the lastReferencedDate.
     */
    public String getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the lastReferencedDate.
     *
     * @param lastReferencedDate to be set.
     */
    public void setLastReferencedDate(final String lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    /**
     * Gets the stockKeepingUnit.
     *
     * @return the stockKeepingUnit.
     */
    public String getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    /**
     * Sets the stockKeepingUnit.
     *
     * @param stockKeepingUnit to be set.
     */
    public void setStockKeepingUnit(final String stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }
}
