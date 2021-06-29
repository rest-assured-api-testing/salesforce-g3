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
package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;

/**
 * This class defines a Contact.
 */
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

    /**
     * Gets the Id.
     *
     * @return the Id.
     */
    public String getId() {
        return this.Id;
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
     * Gets the MasterRecordId.
     *
     * @return the MasterRecordId.
     */
    public String getMasterRecordId() {
        return this.MasterRecordId;
    }
    /**
     * Sets the masterRecordId.
     *
     * @param masterRecordId to be set.
     */
    public void setMasterRecordId(final String masterRecordId) {
        this.MasterRecordId = masterRecordId;
    }
    /**
     * Gets the AccountId.
     *
     * @return the AccountId.
     */
    public String getAccountId() {
        return this.AccountId;
    }
    /**
     * Sets the accountId.
     *
     * @param accountId to be set.
     */
    public void setAccountId(final String accountId) {
        this.AccountId = accountId;
    }
    /**
     * Gets the LastName.
     *
     * @return the LastName.
     */
    public String getLastName() {
        return this.LastName;
    }
    /**
     * Sets the lastName.
     *
     * @param lastName to be set.
     */
    public void setLastName(final String lastName) {
        this.LastName = lastName;
    }
    /**
     * Gets the FirstName.
     *
     * @return the FirstName.
     */
    public String getFirstName() {
        return FirstName;
    }
    /**
     * Sets the firstName.
     *
     * @param firstName to be set.
     */
    public void setFirstName(final String firstName) {
        FirstName = firstName;
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
     * Gets the Name.
     *
     * @return the Name.
     */
    public String getOtherStreet() {
        return OtherStreet;
    }
    /**
     * Sets the otherStreet.
     *
     * @param otherStreet to be set.
     */
    public void setOtherStreet(final String otherStreet) {
        OtherStreet = otherStreet;
    }
    /**
     * Gets the OtherCity.
     *
     * @return the OtherCity.
     */
    public String getOtherCity() {
        return OtherCity;
    }
    /**
     * Sets the otherCity.
     *
     * @param otherCity to be set.
     */
    public void setOtherCity(final String otherCity) {
        OtherCity = otherCity;
    }
    /**
     * Gets the OtherState.
     *
     * @return the OtherState.
     */
    public String getOtherState() {
        return OtherState;
    }
    /**
     * Sets the otherState.
     *
     * @param otherState to be set.
     */
    public void setOtherState(final String otherState) {
        OtherState = otherState;
    }
    /**
     * Gets the OtherPostalCode.
     *
     * @return the OtherPostalCode.
     */
    public String getOtherPostalCode() {
        return OtherPostalCode;
    }
    /**
     * Sets the otherPostalCode.
     *
     * @param otherPostalCode to be set.
     */
    public void setOtherPostalCode(final String otherPostalCode) {
        OtherPostalCode = otherPostalCode;
    }
    /**
     * Gets the OtherCountry.
     *
     * @return the OtherCountry.
     */
    public String getOtherCountry() {
        return OtherCountry;
    }
    /**
     * Sets the otherCountry.
     *
     * @param otherCountry to be set.
     */
    public void setOtherCountry(final String otherCountry) {
        OtherCountry = otherCountry;
    }
    /**
     * Gets the OtherLatitude.
     *
     * @return the OtherLatitude.
     */
    public String getOtherLatitude() {
        return OtherLatitude;
    }
    /**
     * Sets the otherLatitude.
     *
     * @param otherLatitude to be set.
     */
    public void setOtherLatitude(final String otherLatitude) {
        OtherLatitude = otherLatitude;
    }
    /**
     * Gets the OtherLongitude.
     *
     * @return the OtherLongitude.
     */
    public String getOtherLongitude() {
        return OtherLongitude;
    }
    /**
     * Sets the otherLongitude.
     *
     * @param otherLongitude to be set.
     */
    public void setOtherLongitude(final String otherLongitude) {
        OtherLongitude = otherLongitude;
    }
    /**
     * Gets the OtherGeocodeAccuracy.
     *
     * @return the OtherGeocodeAccuracy.
     */
    public String getOtherGeocodeAccuracy() {
        return OtherGeocodeAccuracy;
    }
    /**
     * Sets the otherGeocodeAccuracy.
     *
     * @param otherGeocodeAccuracy to be set.
     */
    public void setOtherGeocodeAccuracy(final String otherGeocodeAccuracy) {
        OtherGeocodeAccuracy = otherGeocodeAccuracy;
    }
    /**
     * Gets the OtherAddress.
     *
     * @return the OtherAddress.
     */
    public String getOtherAddress() {
        return OtherAddress;
    }
    /**
     * Sets the otherAddress.
     *
     * @param otherAddress to be set.
     */
    public void setOtherAddress(final String otherAddress) {
        OtherAddress = otherAddress;
    }
    /**
     * Gets the MailingCity.
     *
     * @return the MailingCity.
     */
    public String getMailingCity() {
        return MailingCity;
    }
    /**
     * Sets the mailingCity.
     *
     * @param mailingCity to be set.
     */
    public void setMailingCity(final String mailingCity) {
        MailingCity = mailingCity;
    }
    /**
     * Gets the MailingState.
     *
     * @return the MailingState.
     */
    public String getMailingState() {
        return MailingState;
    }
    /**
     * Sets the mailingState.
     *
     * @param mailingState to be set.
     */
    public void setMailingState(final String mailingState) {
        MailingState = mailingState;
    }
    /**
     * Gets the MailingPostalCode.
     *
     * @return the MailingPostalCode.
     */
    public String getMailingPostalCode() {
        return MailingPostalCode;
    }
    /**
     * Sets the mailingPostalCode.
     *
     * @param mailingPostalCode to be set.
     */
    public void setMailingPostalCode(final String mailingPostalCode) {
        MailingPostalCode = mailingPostalCode;
    }
    /**
     * Gets the Phone.
     *
     * @return the Phone.
     */
    public Integer getPhone() {
        return Phone;
    }
    /**
     * Sets the phone.
     *
     * @param phone to be set.
     */
    public void setPhone(final Integer phone) {
        Phone = phone;
    }
    /**
     * Gets the Fax.
     *
     * @return the Fax.
     */
    public Integer getFax() {
        return Fax;
    }
    /**
     * Sets the fax.
     *
     * @param fax to be set.
     */
    public void setFax(final Integer fax) {
        Fax = fax;
    }
    /**
     * Gets the MobilePhone.
     *
     * @return the MobilePhone.
     */
    public Integer getMobilePhone() {
        return MobilePhone;
    }
    /**
     * Sets the mobilePhone.
     *
     * @param mobilePhone to be set.
     */
    public void setMobilePhone(final Integer mobilePhone) {
        MobilePhone = mobilePhone;
    }
    /**
     * Gets the HomePhone.
     *
     * @return the HomePhone.
     */
    public Integer getHomePhone() {
        return HomePhone;
    }
    /**
     * Sets the homePhone.
     *
     * @param homePhone to be set.
     */
    public void setHomePhone(final Integer homePhone) {
        HomePhone = homePhone;
    }
    /**
     * Gets the OtherPhone.
     *
     * @return the OtherPhone.
     */
    public Integer getOtherPhone() {
        return OtherPhone;
    }
    /**
     * Sets the otherPhone.
     *
     * @param otherPhone to be set.
     */
    public void setOtherPhone(final Integer otherPhone) {
        OtherPhone = otherPhone;
    }
    /**
     * Gets the AssistantPhone.
     *
     * @return the AssistantPhone.
     */
    public Integer getAssistantPhone() {
        return AssistantPhone;
    }
    /**
     * Sets the assistantPhone.
     *
     * @param assistantPhone to be set.
     */
    public void setAssistantPhone(final Integer assistantPhone) {
        AssistantPhone = assistantPhone;
    }
    /**
     * Gets the ReportsToId.
     *
     * @return the ReportsToId.
     */
    public String getReportsToId() {
        return ReportsToId;
    }
    /**
     * Sets the reportsToId.
     *
     * @param reportsToId to be set.
     */
    public void setReportsToId(final String reportsToId) {
        ReportsToId = reportsToId;
    }
    /**
     * Gets the Email.
     *
     * @return the Email.
     */
    public String getEmail() {
        return Email;
    }
    /**
     * Sets the email.
     *
     * @param email to be set.
     */
    public void setEmail(final String email) {
        Email = email;
    }
    /**
     * Gets the Title.
     *
     * @return the Title.
     */
    public String getTitle() {
        return Title;
    }
    /**
     * Sets the title.
     *
     * @param title to be set.
     */
    public void setTitle(final String title) {
        Title = title;
    }
    /**
     * Gets the Department.
     *
     * @return the Department.
     */
    public String getDepartment() {
        return Department;
    }
    /**
     * Sets the department.
     *
     * @param department to be set.
     */
    public void setDepartment(final String department) {
        Department = department;
    }
    /**
     * Gets the AssistantName.
     *
     * @return the AssistantName.
     */
    public String getAssistantName() {
        return AssistantName;
    }
    /**
     * Sets the assistantName.
     *
     * @param assistantName to be set.
     */
    public void setAssistantName(final String assistantName) {
        AssistantName = assistantName;
    }
    /**
     * Gets the Birthdate.
     *
     * @return the Birthdate.
     */
    public Date getBirthdate() {
        return Birthdate;
    }
    /**
     * Sets the birthdate.
     *
     * @param birthdate to be set.
     */
    public void setBirthdate(final Date birthdate) {
        Birthdate = birthdate;
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
    public Date getCreatedDate() {
        return CreatedDate;
    }
    /**
     * Sets the createdDate.
     *
     * @param createdDate to be set.
     */
    public void setCreatedDate(final Date createdDate) {
        CreatedDate = createdDate;
    }
    /**
     * Gets the CreatedById.
     *
     * @return the CreatedById.
     */
    public Date getCreatedById() {
        return CreatedById;
    }
    /**
     * Sets the createdById.
     *
     * @param createdById to be set.
     */
    public void setCreatedById(final Date createdById) {
        CreatedById = createdById;
    }
    /**
     * Gets the LastModifiedDate.
     *
     * @return the LastModifiedDate.
     */
    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }
    /**
     * Sets the lastModifiedDate.
     *
     * @param lastModifiedDate to be set.
     */
    public void setLastModifiedDate(final Date lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }
    /**
     * Gets the LastModifiedById.
     *
     * @return the LastModifiedById.
     */
    public Date getLastModifiedById() {
        return LastModifiedById;
    }
    /**
     * Sets the lastModifiedById.
     *
     * @param lastModifiedById to be set.
     */
    public void setLastModifiedById(final Date lastModifiedById) {
        LastModifiedById = lastModifiedById;
    }
}
