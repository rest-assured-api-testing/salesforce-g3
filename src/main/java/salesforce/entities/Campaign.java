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
 * This class builds a Campaign json body.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Campaign {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Attributes attributes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String IsDeleted;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ParentId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String StartDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String EndDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ExpectedRevenue;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String BudgetedCost;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ActualCost;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ExpectedResponse;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberSent;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String IsActive;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberOfLeads;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberOfConvertedLeads;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberOfContacts;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberOfResponses;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberOfOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String NumberOfWonOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String AmountAllOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String AmountWonOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String OwnerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String CreatedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String CreatedById;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String LastModifiedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String LastModifiedById;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String SystemModstamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String LastActivityDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String LastViewedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String LastReferencedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String CampaignMemberRecordTypeId;

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
        Id = id;
    }

    /**
     * Gets the IsDeleted.
     *
     * @return the IsDeleted.
     */
    public String isDeleted() {
        return IsDeleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted to be set.
     */
    public void setDeleted(final String deleted) {
        IsDeleted = deleted;
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
     * Gets the ParentId.
     *
     * @return the ParentId.
     */
    public String getParentId() {
        return ParentId;
    }

    /**
     * Sets the parentId.
     *
     * @param parentId to be set.
     */
    public void setParentId(final String parentId) {
        ParentId = parentId;
    }

    /**
     * Gets the Type.
     *
     * @return the Type.
     */
    public String getType() {
        return Type;
    }

    /**
     * Sets the type.
     *
     * @param type to be set.
     */
    public void setType(final String type) {
        Type = type;
    }

    /**
     * Gets the Status.
     *
     * @return the Status.
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the status.
     *
     * @param status to be set.
     */
    public void setStatus(final String status) {
        Status = status;
    }

    /**
     * Gets the StartDate.
     *
     * @return the StartDate.
     */
    public String getStartDate() {
        return StartDate;
    }

    /**
     * Sets the startDate.
     *
     * @param startDate to be set.
     */
    public void setStartDate(final String startDate) {
        StartDate = startDate;
    }

    /**
     * Gets the EndDate.
     *
     * @return the EndDate.
     */
    public String getEndDate() {
        return EndDate;
    }

    /**
     * Sets the endDate.
     *
     * @param endDate to be set.
     */
    public void setEndDate(final String endDate) {
        EndDate = endDate;
    }

    /**
     * Gets the ExpectedRevenue.
     *
     * @return the ExpectedRevenue.
     */
    public String getExpectedRevenue() {
        return ExpectedRevenue;
    }

    /**
     * Sets the expectedRevenue.
     *
     * @param expectedRevenue to be set.
     */
    public void setExpectedRevenue(final String expectedRevenue) {
        ExpectedRevenue = expectedRevenue;
    }

    /**
     * Gets the BudgetedCost.
     *
     * @return the BudgetedCost.
     */
    public String getBudgetedCost() {
        return BudgetedCost;
    }

    /**
     * Sets the budgetedCost.
     *
     * @param budgetedCost to be set.
     */
    public void setBudgetedCost(final String budgetedCost) {
        BudgetedCost = budgetedCost;
    }

    /**
     * Gets the ActualCost.
     *
     * @return the ActualCost.
     */
    public String getActualCost() {
        return ActualCost;
    }

    /**
     * Sets the actualCost.
     *
     * @param actualCost to be set.
     */
    public void setActualCost(final String actualCost) {
        ActualCost = actualCost;
    }

    /**
     * Gets the ExpectedResponse.
     *
     * @return the ExpectedResponse.
     */
    public String getExpectedResponse() {
        return ExpectedResponse;
    }

    /**
     * Sets the expectedResponse.
     *
     * @param expectedResponse to be set.
     */
    public void setExpectedResponse(final String expectedResponse) {
        ExpectedResponse = expectedResponse;
    }

    /**
     * Gets the NumberSent.
     *
     * @return the NumberSent.
     */
    public String getNumberSent() {
        return NumberSent;
    }

    /**
     * Sets the numberSent.
     *
     * @param numberSent to be set.
     */
    public void setNumberSent(final String numberSent) {
        NumberSent = numberSent;
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
     * Gets the NumberOfLeads.
     *
     * @return the NumberOfLeads.
     */
    public String getNumberOfLeads() {
        return NumberOfLeads;
    }

    /**
     * Sets the numberOfLeads.
     *
     * @param numberOfLeads to be set.
     */
    public void setNumberOfLeads(final String numberOfLeads) {
        NumberOfLeads = numberOfLeads;
    }

    /**
     * Gets the NumberOfConvertedLeads.
     *
     * @return the NumberOfConvertedLeads.
     */
    public String getNumberOfConvertedLeads() {
        return NumberOfConvertedLeads;
    }

    /**
     * Sets the numberOfConvertedLeads.
     *
     * @param numberOfConvertedLeads to be set.
     */
    public void setNumberOfConvertedLeads(final String numberOfConvertedLeads) {
        NumberOfConvertedLeads = numberOfConvertedLeads;
    }

    /**
     * Gets the NumberOfContacts.
     *
     * @return the NumberOfContacts.
     */
    public String getNumberOfContacts() {
        return NumberOfContacts;
    }

    /**
     * Sets the numberOfContacts.
     *
     * @param numberOfContacts to be set.
     */
    public void setNumberOfContacts(final String numberOfContacts) {
        NumberOfContacts = numberOfContacts;
    }

    /**
     * Gets the NumberOfResponses.
     *
     * @return the NumberOfResponses.
     */
    public String getNumberOfResponses() {
        return NumberOfResponses;
    }

    /**
     * Sets the numberOfResponses.
     *
     * @param numberOfResponses to be set.
     */
    public void setNumberOfResponses(final String numberOfResponses) {
        NumberOfResponses = numberOfResponses;
    }

    /**
     * Gets the NumberOfOpportunities.
     *
     * @return the NumberOfOpportunities.
     */
    public String getNumberOfOpportunities() {
        return NumberOfOpportunities;
    }

    /**
     * Sets the numberOfOpportunities.
     *
     * @param numberOfOpportunities to be set.
     */
    public void setNumberOfOpportunities(final String numberOfOpportunities) {
        NumberOfOpportunities = numberOfOpportunities;
    }

    /**
     * Gets the NumberOfWonOpportunities.
     *
     * @return the NumberOfWonOpportunities.
     */
    public String getNumberOfWonOpportunities() {
        return NumberOfWonOpportunities;
    }

    /**
     * Sets the numberOfWonOpportunities.
     *
     * @param numberOfWonOpportunities to be set.
     */
    public void setNumberOfWonOpportunities(final String numberOfWonOpportunities) {
        NumberOfWonOpportunities = numberOfWonOpportunities;
    }

    /**
     * Gets the AmountAllOpportunities.
     *
     * @return the AmountAllOpportunities.
     */
    public String getAmountAllOpportunities() {
        return AmountAllOpportunities;
    }

    /**
     * Sets the amountAllOpportunities.
     *
     * @param amountAllOpportunities to be set.
     */
    public void setAmountAllOpportunities(final String amountAllOpportunities) {
        AmountAllOpportunities = amountAllOpportunities;
    }

    /**
     * Gets the AmountWonOpportunities.
     *
     * @return the AmountWonOpportunities.
     */
    public String getAmountWonOpportunities() {
        return AmountWonOpportunities;
    }

    /**
     * Sets the amountWonOpportunities.
     *
     * @param amountWonOpportunities to be set.
     */
    public void setAmountWonOpportunities(final String amountWonOpportunities) {
        AmountWonOpportunities = amountWonOpportunities;
    }

    /**
     * Gets the OwnerId.
     *
     * @return the OwnerId.
     */
    public String getOwnerId() {
        return OwnerId;
    }

    /**
     * Sets the ownerId.
     *
     * @param ownerId to be set.
     */
    public void setOwnerId(final String ownerId) {
        OwnerId = ownerId;
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
     * Gets the LastActivityDate.
     *
     * @return the LastActivityDate.
     */
    public String getLastActivityDate() {
        return LastActivityDate;
    }

    /**
     * Sets the lastActivityDate.
     *
     * @param lastActivityDate to be set.
     */
    public void setLastActivityDate(final String lastActivityDate) {
        LastActivityDate = lastActivityDate;
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
     * Gets the CampaignMemberRecordTypeId.
     *
     * @return the CampaignMemberRecordTypeId.
     */
    public String getCampaignMemberRecordTypeId() {
        return CampaignMemberRecordTypeId;
    }

    /**
     * Sets the campaignMemberRecordTypeId.
     *
     * @param campaignMemberRecordTypeId to be set.
     */
    public void setCampaignMemberRecordTypeId(final String campaignMemberRecordTypeId) {
        CampaignMemberRecordTypeId = campaignMemberRecordTypeId;
    }
}
