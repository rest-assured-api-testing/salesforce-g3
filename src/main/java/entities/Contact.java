package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Id;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String MasterRecordId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String AccountId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String LastName;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String FirstName;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Name;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherStreet;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherCity;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherState;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherPostalCode;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherCountry;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherLatitude;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherLongitude;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherGeocodeAccuracy;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OtherAddress;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String MailingCity;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String MailingState;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String MailingPostalCode;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer Phone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer Fax;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer MobilePhone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer HomePhone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer OtherPhone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer AssistantPhone;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String ReportsToId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Email;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Title;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Department;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String AssistantName;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Date Birthdate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Description;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String OwnerId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Date CreatedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Date CreatedById;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Date LastModifiedDate;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Date LastModifiedById;

    public String getId() {
        return this.Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getMasterRecordId() {
        return this.MasterRecordId;
    }

    public void setMasterRecordId(String masterRecordId) {
        this.MasterRecordId = masterRecordId;
    }

    public String getAccountId() {
        return this.AccountId;
    }

    public void setAccountId(String accountId) {
        this.AccountId = accountId;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOtherStreet() {
        return OtherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        OtherStreet = otherStreet;
    }

    public String getOtherCity() {
        return OtherCity;
    }

    public void setOtherCity(String otherCity) {
        OtherCity = otherCity;
    }

    public String getOtherState() {
        return OtherState;
    }

    public void setOtherState(String otherState) {
        OtherState = otherState;
    }

    public String getOtherPostalCode() {
        return OtherPostalCode;
    }

    public void setOtherPostalCode(String otherPostalCode) {
        OtherPostalCode = otherPostalCode;
    }

    public String getOtherCountry() {
        return OtherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        OtherCountry = otherCountry;
    }

    public String getOtherLatitude() {
        return OtherLatitude;
    }

    public void setOtherLatitude(String otherLatitude) {
        OtherLatitude = otherLatitude;
    }

    public String getOtherLongitude() {
        return OtherLongitude;
    }

    public void setOtherLongitude(String otherLongitude) {
        OtherLongitude = otherLongitude;
    }

    public String getOtherGeocodeAccuracy() {
        return OtherGeocodeAccuracy;
    }

    public void setOtherGeocodeAccuracy(String otherGeocodeAccuracy) {
        OtherGeocodeAccuracy = otherGeocodeAccuracy;
    }

    public String getOtherAddress() {
        return OtherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        OtherAddress = otherAddress;
    }

    public String getMailingCity() {
        return MailingCity;
    }

    public void setMailingCity(String mailingCity) {
        MailingCity = mailingCity;
    }

    public String getMailingState() {
        return MailingState;
    }

    public void setMailingState(String mailingState) {
        MailingState = mailingState;
    }

    public String getMailingPostalCode() {
        return MailingPostalCode;
    }

    public void setMailingPostalCode(String mailingPostalCode) {
        MailingPostalCode = mailingPostalCode;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public Integer getFax() {
        return Fax;
    }

    public void setFax(Integer fax) {
        Fax = fax;
    }

    public Integer getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        MobilePhone = mobilePhone;
    }

    public Integer getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(Integer homePhone) {
        HomePhone = homePhone;
    }

    public Integer getOtherPhone() {
        return OtherPhone;
    }

    public void setOtherPhone(Integer otherPhone) {
        OtherPhone = otherPhone;
    }

    public Integer getAssistantPhone() {
        return AssistantPhone;
    }

    public void setAssistantPhone(Integer assistantPhone) {
        AssistantPhone = assistantPhone;
    }

    public String getReportsToId() {
        return ReportsToId;
    }

    public void setReportsToId(String reportsToId) {
        ReportsToId = reportsToId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAssistantName() {
        return AssistantName;
    }

    public void setAssistantName(String assistantName) {
        AssistantName = assistantName;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getCreatedById() {
        return CreatedById;
    }

    public void setCreatedById(Date createdById) {
        CreatedById = createdById;
    }

    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    public Date getLastModifiedById() {
        return LastModifiedById;
    }

    public void setLastModifiedById(Date lastModifiedById) {
        LastModifiedById = lastModifiedById;
    }
}
