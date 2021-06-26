package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

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

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String isDeleted() {
        return IsDeleted;
    }

    public void setDeleted(String deleted) {
        IsDeleted = deleted;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
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

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getExpectedRevenue() {
        return ExpectedRevenue;
    }

    public void setExpectedRevenue(String expectedRevenue) {
        ExpectedRevenue = expectedRevenue;
    }

    public String getBudgetedCost() {
        return BudgetedCost;
    }

    public void setBudgetedCost(String budgetedCost) {
        BudgetedCost = budgetedCost;
    }

    public String getActualCost() {
        return ActualCost;
    }

    public void setActualCost(String actualCost) {
        ActualCost = actualCost;
    }

    public String getExpectedResponse() {
        return ExpectedResponse;
    }

    public void setExpectedResponse(String expectedResponse) {
        ExpectedResponse = expectedResponse;
    }

    public String getNumberSent() {
        return NumberSent;
    }

    public void setNumberSent(String numberSent) {
        NumberSent = numberSent;
    }

    public String isActive() {
        return IsActive;
    }

    public void setActive(String active) {
        IsActive = active;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getNumberOfLeads() {
        return NumberOfLeads;
    }

    public void setNumberOfLeads(String numberOfLeads) {
        NumberOfLeads = numberOfLeads;
    }

    public String getNumberOfConvertedLeads() {
        return NumberOfConvertedLeads;
    }

    public void setNumberOfConvertedLeads(String numberOfConvertedLeads) {
        NumberOfConvertedLeads = numberOfConvertedLeads;
    }

    public String getNumberOfContacts() {
        return NumberOfContacts;
    }

    public void setNumberOfContacts(String numberOfContacts) {
        NumberOfContacts = numberOfContacts;
    }

    public String getNumberOfResponses() {
        return NumberOfResponses;
    }

    public void setNumberOfResponses(String numberOfResponses) {
        NumberOfResponses = numberOfResponses;
    }

    public String getNumberOfOpportunities() {
        return NumberOfOpportunities;
    }

    public void setNumberOfOpportunities(String numberOfOpportunities) {
        NumberOfOpportunities = numberOfOpportunities;
    }

    public String getNumberOfWonOpportunities() {
        return NumberOfWonOpportunities;
    }

    public void setNumberOfWonOpportunities(String numberOfWonOpportunities) {
        NumberOfWonOpportunities = numberOfWonOpportunities;
    }

    public String getAmountAllOpportunities() {
        return AmountAllOpportunities;
    }

    public void setAmountAllOpportunities(String amountAllOpportunities) {
        AmountAllOpportunities = amountAllOpportunities;
    }

    public String getAmountWonOpportunities() {
        return AmountWonOpportunities;
    }

    public void setAmountWonOpportunities(String amountWonOpportunities) {
        AmountWonOpportunities = amountWonOpportunities;
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

    public String getLastActivityDate() {
        return LastActivityDate;
    }

    public void setLastActivityDate(String lastActivityDate) {
        LastActivityDate = lastActivityDate;
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

    public String getCampaignMemberRecordTypeId() {
        return CampaignMemberRecordTypeId;
    }

    public void setCampaignMemberRecordTypeId(String campaignMemberRecordTypeId) {
        CampaignMemberRecordTypeId = campaignMemberRecordTypeId;
    }
}
