package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMasterRecordId() {
        return MasterRecordId;
    }

    public void setMasterRecordId(String masterRecordId) {
        MasterRecordId = masterRecordId;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        CaseNumber = caseNumber;
    }

    public String getContactId() {
        return ContactId;
    }

    public void setContactId(String contactId) {
        ContactId = contactId;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public String getAssetId() {
        return AssetId;
    }

    public void setAssetId(String assetId) {
        AssetId = assetId;
    }

    public String getSourceId() {
        return SourceId;
    }

    public void setSourceId(String sourceId) {
        SourceId = sourceId;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }

    public String getSuppliedName() {
        return SuppliedName;
    }

    public void setSuppliedName(String suppliedName) {
        SuppliedName = suppliedName;
    }

    public String getSuppliedEmail() {
        return SuppliedEmail;
    }

    public void setSuppliedEmail(String suppliedEmail) {
        SuppliedEmail = suppliedEmail;
    }

    public String getSuppliedPhone() {
        return SuppliedPhone;
    }

    public void setSuppliedPhone(String suppliedPhone) {
        SuppliedPhone = suppliedPhone;
    }

    public String getSuppliedCompany() {
        return SuppliedCompany;
    }

    public void setSuppliedCompany(String suppliedCompany) {
        SuppliedCompany = suppliedCompany;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getClosedDate() {
        return ClosedDate;
    }

    public void setClosedDate(String closedDate) {
        ClosedDate = closedDate;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getCreatedById() {
        return CreatedById;
    }

    public void setCreatedById(String createdById) {
        CreatedById = createdById;
    }

    public String getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return LastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        LastModifiedById = lastModifiedById;
    }

    public String getSystemModstamp() {
        return SystemModstamp;
    }

    public void setSystemModstamp(String systemModstamp) {
        SystemModstamp = systemModstamp;
    }

    public String getContactPhone() {
        return ContactPhone;
    }

    public void setContactPhone(String contactPhone) {
        ContactPhone = contactPhone;
    }

    public String getContactMobile() {
        return ContactMobile;
    }

    public void setContactMobile(String contactMobile) {
        ContactMobile = contactMobile;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public String getContactFax() {
        return ContactFax;
    }

    public void setContactFax(String contactFax) {
        ContactFax = contactFax;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public String getLastViewedDate() {
        return LastViewedDate;
    }

    public void setLastViewedDate(String lastViewedDate) {
        LastViewedDate = lastViewedDate;
    }

    public String getLastReferencedDate() {
        return LastReferencedDate;
    }

    public void setLastReferencedDate(String lastReferencedDate) {
        LastReferencedDate = lastReferencedDate;
    }

    public String getEngineeringReqNumber__c() {
        return EngineeringReqNumber__c;
    }

    public void setEngineeringReqNumber__c(String engineeringReqNumber__c) {
        EngineeringReqNumber__c = engineeringReqNumber__c;
    }

    public String getSLAViolation__c() {
        return SLAViolation__c;
    }

    public void setSLAViolation__c(String SLAViolation__c) {
        this.SLAViolation__c = SLAViolation__c;
    }

    public String getProduct__c() {
        return Product__c;
    }

    public void setProduct__c(String product__c) {
        Product__c = product__c;
    }

    public String getPotentialLiability__c() {
        return PotentialLiability__c;
    }

    public void setPotentialLiability__c(String potentialLiability__c) {
        PotentialLiability__c = potentialLiability__c;
    }
}
