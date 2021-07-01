/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Paola Ximena Aguilar Quiñones
 */
package salesforce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class builds a Case json body.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Case {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Id;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String MasterRecordId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String CaseNumber;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String ContactId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String AccountId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String AssetId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SourceId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String ParentId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SuppliedName;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SuppliedEmail;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SuppliedPhone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SuppliedCompany;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Type;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Status;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Reason;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Origin;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Subject;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Priority;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ClosedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OwnerId;
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
    private String ContactPhone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String ContactMobile;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String ContactEmail;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String ContactFax;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Comments;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastViewedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastReferencedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String EngineeringReqNumber__c;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String SLAViolation__c;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Product__c;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String PotentialLiability__c;

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
     * Gets the MasterRecordId.
     *
     * @return the MasterRecordId.
     */
    public String getMasterRecordId() {
        return MasterRecordId;
    }

    /**
     * Sets the masterRecordId.
     *
     * @param masterRecordId to be set.
     */
    public void setMasterRecordId(final String masterRecordId) {
        MasterRecordId = masterRecordId;
    }

    /**
     * Gets the CaseNumber.
     *
     * @return the CaseNumber.
     */
    public String getCaseNumber() {
        return CaseNumber;
    }

    /**
     * Sets the caseNumber.
     *
     * @param caseNumber to be set.
     */
    public void setCaseNumber(final String caseNumber) {
        CaseNumber = caseNumber;
    }

    /**
     * Gets the ContactId.
     *
     * @return the ContactId.
     */
    public String getContactId() {
        return ContactId;
    }

    /**
     * Sets the contactId.
     *
     * @param contactId to be set.
     */
    public void setContactId(final String contactId) {
        ContactId = contactId;
    }

    /**
     * Gets the AccountId.
     *
     * @return the AccountId.
     */
    public String getAccountId() {
        return AccountId;
    }

    /**
     * Sets the accountId.
     *
     * @param accountId to be set.
     */
    public void setAccountId(final String accountId) {
        AccountId = accountId;
    }

    /**
     * Gets the AssetId.
     *
     * @return the AssetId.
     */
    public String getAssetId() {
        return AssetId;
    }

    /**
     * Sets the assetId.
     *
     * @param assetId to be set.
     */
    public void setAssetId(final String assetId) {
        AssetId = assetId;
    }

    /**
     * Gets the SourceId.
     *
     * @return the SourceId.
     */
    public String getSourceId() {
        return SourceId;
    }

    /**
     * Sets the sourceId.
     *
     * @param sourceId to be set.
     */
    public void setSourceId(final String sourceId) {
        SourceId = sourceId;
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
     * Gets the SuppliedName.
     *
     * @return the SuppliedName.
     */
    public String getSuppliedName() {
        return SuppliedName;
    }

    /**
     * Sets the suppliedName.
     *
     * @param suppliedName to be set.
     */
    public void setSuppliedName(final String suppliedName) {
        SuppliedName = suppliedName;
    }

    /**
     * Gets the SuppliedEmail.
     *
     * @return the SuppliedEmail.
     */
    public String getSuppliedEmail() {
        return SuppliedEmail;
    }

    /**
     * Sets the suppliedEmail.
     *
     * @param suppliedEmail to be set.
     */
    public void setSuppliedEmail(final String suppliedEmail) {
        SuppliedEmail = suppliedEmail;
    }

    /**
     * Gets the SuppliedPhone.
     *
     * @return the SuppliedPhone.
     */
    public String getSuppliedPhone() {
        return SuppliedPhone;
    }

    /**
     * Sets the suppliedPhone.
     *
     * @param suppliedPhone to be set.
     */
    public void setSuppliedPhone(final String suppliedPhone) {
        SuppliedPhone = suppliedPhone;
    }

    /**
     * Gets the SuppliedCompany.
     *
     * @return the SuppliedCompany.
     */
    public String getSuppliedCompany() {
        return SuppliedCompany;
    }

    /**
     * Sets the suppliedCompany.
     *
     * @param suppliedCompany to be set.
     */
    public void setSuppliedCompany(final String suppliedCompany) {
        SuppliedCompany = suppliedCompany;
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
     * Sets the Status.
     *
     * @param status to be set.
     */
    public void setStatus(final String status) {
        Status = status;
    }

    /**
     * Gets the Reason.
     *
     * @return the Reason.
     */
    public String getReason() {
        return Reason;
    }

    /**
     * Sets the reason.
     *
     * @param reason to be set.
     */
    public void setReason(final String reason) {
        Reason = reason;
    }

    /**
     * Gets the Origin.
     *
     * @return the Origin.
     */
    public String getOrigin() {
        return Origin;
    }

    /**
     * Sets the origin.
     *
     * @param origin to be set.
     */
    public void setOrigin(final String origin) {
        Origin = origin;
    }

    /**
     * Gets the Subject.
     *
     * @return the Subject.
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * Sets the subject.
     *
     * @param subject to be set.
     */
    public void setSubject(final String subject) {
        Subject = subject;
    }

    /**
     * Gets the Priority.
     *
     * @return the Priority.
     */
    public String getPriority() {
        return Priority;
    }

    /**
     * Sets the priority.
     *
     * @param priority to be set.
     */
    public void setPriority(final String priority) {
        Priority = priority;
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
     * Gets the ClosedDate.
     *
     * @return the ClosedDate.
     */
    public String getClosedDate() {
        return ClosedDate;
    }

    /**
     * Sets the closedDate.
     *
     * @param closedDate to be set.
     */
    public void setClosedDate(final String closedDate) {
        ClosedDate = closedDate;
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
     * Gets the ContactPhone.
     *
     * @return the ContactPhone.
     */
    public String getContactPhone() {
        return ContactPhone;
    }

    /**
     * Sets the contactPhone.
     *
     * @param contactPhone to be set.
     */
    public void setContactPhone(final String contactPhone) {
        ContactPhone = contactPhone;
    }

    /**
     * Gets the ContactMobile.
     *
     * @return the ContactMobile.
     */
    public String getContactMobile() {
        return ContactMobile;
    }

    /**
     * Sets the contactPhone.
     *
     * @param contactMobile to be set.
     */
    public void setContactMobile(final String contactMobile) {
        ContactMobile = contactMobile;
    }

    /**
     * Gets the ContactEmail.
     *
     * @return the ContactEmail.
     */
    public String getContactEmail() {
        return ContactEmail;
    }

    /**
     * Sets the contactEmail.
     *
     * @param contactEmail to be set.
     */
    public void setContactEmail(final String contactEmail) {
        ContactEmail = contactEmail;
    }

    /**
     * Gets the ContactFax.
     *
     * @return the ContactFax.
     */
    public String getContactFax() {
        return ContactFax;
    }

    /**
     * Sets the contactFax.
     *
     * @param contactFax to be set.
     */
    public void setContactFax(final String contactFax) {
        ContactFax = contactFax;
    }

    /**
     * Gets the Comments.
     *
     * @return the Comments.
     */
    public String getComments() {
        return Comments;
    }

    /**
     * Sets the comments.
     *
     * @param comments to be set.
     */
    public void setComments(final String comments) {
        Comments = comments;
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
     * Gets the EngineeringReqNumber__c.
     *
     * @return the EngineeringReqNumber__c.
     */
    public String getEngineeringReqNumber__c() {
        return EngineeringReqNumber__c;
    }

    /**
     * Sets the engineeringReqNumber__c.
     *
     * @param engineeringReqNumber__c to be set.
     */
    public void setEngineeringReqNumber__c(final String engineeringReqNumber__c) {
        EngineeringReqNumber__c = engineeringReqNumber__c;
    }

    /**
     * Gets the SLAViolation__c.
     *
     * @return the SLAViolation__c.
     */
    public String getSLAViolation__c() {
        return SLAViolation__c;
    }

    /**
     * Sets the SLAViolation__c.
     *
     * @param SLAViolation__c to be set.
     */
    public void setSLAViolation__c(final String SLAViolation__c) {
        this.SLAViolation__c = SLAViolation__c;
    }

    /**
     * Gets the Product__c.
     *
     * @return the Product__c.
     */
    public String getProduct__c() {
        return Product__c;
    }

    /**
     * Sets the product__c.
     *
     * @param product__c to be set.
     */
    public void setProduct__c(final String product__c) {
        Product__c = product__c;
    }

    /**
     * Gets the PotentialLiability__c.
     *
     * @return the PotentialLiability__c.
     */
    public String getPotentialLiability__c() {
        return PotentialLiability__c;
    }

    /**
     * Sets the potentialLiability__c.
     *
     * @param potentialLiability__c to be set.
     */
    public void setPotentialLiability__c(final String potentialLiability__c) {
        PotentialLiability__c = potentialLiability__c;
    }
}
