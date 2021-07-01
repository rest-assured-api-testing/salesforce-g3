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
 * This class defines a price book schema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceBook {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Attributes attributes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Id;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String IsDeleted;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Name;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String CreatedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String CreatedById;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastModifiedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastModifiedById;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SystemModstamp;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastViewedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastReferencedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String IsActive;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String IsArchived;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Description;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String IsStandard;

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
        this.Id = id;
    }

    /**
     * Gets the IsDeleted.
     *
     * @return the IsDeleted.
     */
    public String getIsDeleted() {
        return IsDeleted;
    }

    /**
     * Sets the isDeleted.
     *
     * @param isDeleted to be set.
     */
    public void setIsDeleted(final String isDeleted) {
        IsDeleted = isDeleted;
    }

    /**
     * Gets the Name.
     *
     * @return the Name.
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the name.
     *
     * @param name to be set.
     */
    public void setName(final String name) {
        Name = name;
    }

    /**
     * Gets the CreatedDate.
     *
     * @return the CreatedDate.
     */
    public String getCreatedDate() {
        return CreatedDate;
    }

    /**
     * Sets the createdDate.
     *
     * @param createdDate to be set.
     */
    public void setCreatedDate(final String createdDate) {
        CreatedDate = createdDate;
    }

    /**
     * Gets the CreatedById.
     *
     * @return the CreatedById.
     */
    public String getCreatedById() {
        return CreatedById;
    }

    /**
     * Sets the createdById.
     *
     * @param createdById to be set.
     */
    public void setCreatedById(final String createdById) {
        CreatedById = createdById;
    }

    /**
     * Gets the LastModifiedDate.
     *
     * @return the LastModifiedDate.
     */
    public String getLastModifiedDate() {
        return LastModifiedDate;
    }

    /**
     * Sets the lastModifiedDate.
     *
     * @param lastModifiedDate to be set.
     */
    public void setLastModifiedDate(final String lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets the LastModifiedById.
     *
     * @return the LastModifiedById.
     */
    public String getLastModifiedById() {
        return LastModifiedById;
    }

    /**
     * Sets the lastModifiedById.
     *
     * @param lastModifiedById to be set.
     */
    public void setLastModifiedById(final String lastModifiedById) {
        LastModifiedById = lastModifiedById;
    }

    /**
     * Gets the SystemModstamp.
     *
     * @return the SystemModstamp.
     */
    public String getSystemModstamp() {
        return SystemModstamp;
    }

    /**
     * Sets the systemModstamp.
     *
     * @param systemModstamp to be set.
     */
    public void setSystemModstamp(final String systemModstamp) {
        SystemModstamp = systemModstamp;
    }

    /**
     * Gets the LastViewedDate.
     *
     * @return the LastViewedDate.
     */
    public String getLastViewedDate() {
        return LastViewedDate;
    }

    /**
     * Sets the lastViewedDate.
     *
     * @param lastViewedDate to be set.
     */
    public void setLastViewedDate(final String lastViewedDate) {
        LastViewedDate = lastViewedDate;
    }

    /**
     * Gets the LastReferencedDate.
     *
     * @return the LastReferencedDate.
     */
    public String getLastReferencedDate() {
        return LastReferencedDate;
    }

    /**
     * Sets the lastReferencedDate.
     *
     * @param lastReferencedDate to be set.
     */
    public void setLastReferencedDate(final String lastReferencedDate) {
        LastReferencedDate = lastReferencedDate;
    }

    /**
     * Gets the IsActive.
     *
     * @return the IsActive.
     */
    public String isActive() {
        return IsActive;
    }

    /**
     * Sets the active.
     *
     * @param active to be set.
     */
    public void setActive(final String active) {
        IsActive = active;
    }

    /**
     * Gets the IsArchived.
     *
     * @return the IsArchived.
     */
    public String isArchived() {
        return IsArchived;
    }

    /**
     * Sets the archived.
     *
     * @param archived to be set.
     */
    public void setArchived(final String archived) {
        IsArchived = archived;
    }

    /**
     * Gets the Description.
     *
     * @return the Description.
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the description.
     *
     * @param description to be set.
     */
    public void setDescription(final String description) {
        Description = description;
    }

    /**
     * Gets the IsStandard.
     *
     * @return the IsStandard.
     */
    public String isStandard() {
        return IsStandard;
    }

    /**
     * Sets the standard.
     *
     * @param standard to be set.
     */
    public void setStandard(final String standard) {
        IsStandard = standard;
    }
}
