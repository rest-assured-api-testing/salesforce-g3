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

import java.util.Date;

/**
 * This class builds an account body.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {

    public Attributes attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    public String masterRecordId;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("ParentId")
    public String parentId;
    @JsonProperty("BillingStreet")
    public String billingStreet;
    @JsonProperty("BillingCity")
    public String billingCity;
    @JsonProperty("BillingState")
    public String billingState;
    @JsonProperty("BillingPostalCode")
    public String billingPostalCode;
    @JsonProperty("BillingCountry")
    public String billingCountry;
    @JsonProperty("BillingLatitude")
    public String billingLatitude;
    @JsonProperty("BillingLongitude")
    public String billingLongitude;
    @JsonProperty("BillingGeocodeAccuracy")
    public String billingGeocodeAccuracy;
    @JsonProperty("BillingAddress")
    public String billingAddress;
    @JsonProperty("ShippingStreet")
    public String shippingStreet;
    @JsonProperty("ShippingCity")
    public String shippingCity;
    @JsonProperty("ShippingState")
    public String shippingState;
    @JsonProperty("ShippingPostalCode")
    public String shippingPostalCode;
    @JsonProperty("ShippingCountry")
    public String shippingCountry;
    @JsonProperty("ShippingLatitude")
    public String shippingLatitude;
    @JsonProperty("ShippingLongitude")
    public String shippingLongitude;
    @JsonProperty("ShippingGeocodeAccuracy")
    public String shippingGeocodeAccuracy;
    @JsonProperty("ShippingAddress")
    public String shippingAddress;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("Fax")
    public String fax;
    @JsonProperty("AccountNumber")
    public String accountNumber;
    @JsonProperty("Website")
    public String website;
    @JsonProperty("PhotoUrl")
    public String photoUrl;
    @JsonProperty("Sic")
    public String sic;
    @JsonProperty("Industry")
    public String industry;
    @JsonProperty("AnnualRevenue")
    public String annualRevenue;
    @JsonProperty("NumberOfEmployees")
    public String numberOfEmployees;
    @JsonProperty("Ownership")
    public String ownership;
    @JsonProperty("TickerSymbol")
    public String tickerSymbol;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Rating")
    public String rating;
    @JsonProperty("Site")
    public String site;
    @JsonProperty("OwnerId")
    public String ownerId;
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
    @JsonProperty("LastActivityDate")
    public String lastActivityDate;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;
    @JsonProperty("Jigsaw")
    public String jigsaw;
    @JsonProperty("JigsawCompanyId")
    public String jigsawCompanyId;
    @JsonProperty("CleanStatus")
    public String cleanStatus;
    @JsonProperty("AccountSource")
    public String accountSource;
    @JsonProperty("DunsNumber")
    public String dunsNumber;
    @JsonProperty("Tradestyle")
    public String tradestyle;
    @JsonProperty("NaicsCode")
    public String naicsCode;
    @JsonProperty("NaicsDesc")
    public String naicsDesc;
    @JsonProperty("YearStarted")
    public String yearStarted;
    @JsonProperty("SicDesc")
    public String sicDesc;
    @JsonProperty("DandbCompanyId")
    public String dandbCompanyId;
    @JsonProperty("OperatingHoursId")
    public String operatingHoursId;
    @JsonProperty("CustomerPriority__c")
    public String customerPriority__c;
    @JsonProperty("SLA__c")
    public String sLA__c;
    @JsonProperty("Active__c")
    public String active__c;
    @JsonProperty("NumberofLocations__c")
    public String numberofLocations__c;
    @JsonProperty("UpsellOpportunity__c")
    public String upsellOpportunity__c;
    @JsonProperty("SLASerialNumber__c")
    public String sLASerialNumber__c;
    @JsonProperty("SLAExpirationDate__c")
    public String sLAExpirationDate__c;

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
     * Gets the masterRecordId.
     *
     * @return the masterRecordId.
     */
    public String getMasterRecordId() {
        return masterRecordId;
    }

    /**
     * Sets the masterRecordId.
     *
     * @param masterRecordId to be set.
     */
    public void setMasterRecordId(final String masterRecordId) {
        this.masterRecordId = masterRecordId;
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
     * Gets the type.
     *
     * @return the type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type to be set.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gets the parentId.
     *
     * @return the parentId.
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId.
     *
     * @param parentId to be set.
     */
    public void setParentId(final String parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the billingStreet.
     *
     * @return the billingStreet.
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * Sets the billingStreet.
     *
     * @param billingStreet to be set.
     */
    public void setBillingStreet(final String billingStreet) {
        this.billingStreet = billingStreet;
    }

    /**
     * Gets the billingCity.
     *
     * @return the billingCity.
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the billingCity.
     *
     * @param billingCity to be set.
     */
    public void setBillingCity(final String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Gets the billingState.
     *
     * @return the billingState.
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * Sets the billingState.
     *
     * @param billingState to be set.
     */
    public void setBillingState(final String billingState) {
        this.billingState = billingState;
    }

    /**
     * Gets the billingPostalCode.
     *
     * @return the billingPostalCode.
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets the billingPostalCode.
     *
     * @param billingPostalCode to be set.
     */
    public void setBillingPostalCode(final String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    /**
     * Gets the billingCountry.
     *
     * @return the billingCountry.
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the billingCountry.
     *
     * @param billingCountry to be set.
     */
    public void setBillingCountry(final String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Gets the billingLatitude.
     *
     * @return the billingLatitude.
     */
    public String getBillingLatitude() {
        return billingLatitude;
    }

    /**
     * Sets the billingLatitude.
     *
     * @param billingLatitude to be set.
     */
    public void setBillingLatitude(final String billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    /**
     * Gets the billingLongitude.
     *
     * @return the billingLongitude.
     */
    public String getBillingLongitude() {
        return billingLongitude;
    }

    /**
     * Sets the billingLongitude.
     *
     * @param billingLongitude to be set.
     */
    public void setBillingLongitude(final String billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    /**
     * Gets the billingGeocodeAccuracy.
     *
     * @return the billingGeocodeAccuracy.
     */
    public String getBillingGeocodeAccuracy() {
        return billingGeocodeAccuracy;
    }

    /**
     * Sets the billingGeocodeAccuracy.
     *
     * @param billingGeocodeAccuracy to be set.
     */
    public void setBillingGeocodeAccuracy(final String billingGeocodeAccuracy) {
        this.billingGeocodeAccuracy = billingGeocodeAccuracy;
    }

    /**
     * Gets the billingAddress.
     *
     * @return the billingAddress.
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the billingAddress.
     *
     * @param billingAddress to be set.
     */
    public void setBillingAddress(final String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Gets the shippingStreet.
     *
     * @return the shippingStreet.
     */
    public String getShippingStreet() {
        return shippingStreet;
    }

    /**
     * Sets the shippingStreet.
     *
     * @param shippingStreet to be set.
     */
    public void setShippingStreet(final String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    /**
     * Gets the shippingCity.
     *
     * @return the shippingCity.
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the shippingCity.
     *
     * @param shippingCity to be set.
     */
    public void setShippingCity(final String shippingCity) {
        this.shippingCity = shippingCity;
    }

    /**
     * Gets the shippingState.
     *
     * @return the shippingState.
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets the shippingState.
     *
     * @param shippingState to be set.
     */
    public void setShippingState(final String shippingState) {
        this.shippingState = shippingState;
    }

    /**
     * Gets the shippingPostalCode.
     *
     * @return the shippingPostalCode.
     */
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    /**
     * Sets the shippingPostalCode.
     *
     * @param shippingPostalCode to be set.
     */
    public void setShippingPostalCode(final String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    /**
     * Gets the shippingCountry.
     *
     * @return the shippingCountry.
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the shippingCountry.
     *
     * @param shippingCountry to be set.
     */
    public void setShippingCountry(final String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    /**
     * Gets the shippingLatitude.
     *
     * @return the shippingLatitude.
     */
    public String getShippingLatitude() {
        return shippingLatitude;
    }

    /**
     * Sets the shippingLatitude.
     *
     * @param shippingLatitude to be set.
     */
    public void setShippingLatitude(final String shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    /**
     * Gets the shippingLongitude.
     *
     * @return the shippingLongitude.
     */
    public String getShippingLongitude() {
        return shippingLongitude;
    }

    /**
     * Sets the shippingLongitude.
     *
     * @param shippingLongitude to be set.
     */
    public void setShippingLongitude(final String shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    /**
     * Gets the shippingGeocodeAccuracy.
     *
     * @return the shippingGeocodeAccuracy.
     */
    public String getShippingGeocodeAccuracy() {
        return shippingGeocodeAccuracy;
    }

    /**
     * Sets the shippingGeocodeAccuracy.
     *
     * @param shippingGeocodeAccuracy to be set.
     */
    public void setShippingGeocodeAccuracy(final String shippingGeocodeAccuracy) {
        this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
    }

    /**
     * Gets the shippingAddress.
     *
     * @return the shippingAddress.
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the shippingAddress.
     *
     * @param shippingAddress to be set.
     */
    public void setShippingAddress(final String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Gets the phone.
     *
     * @return the phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the shippingAddress.
     *
     * @param phone to be set.
     */
    public void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * Gets the fax.
     *
     * @return the fax.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax.
     *
     * @param fax to be set.
     */
    public void setFax(final String fax) {
        this.fax = fax;
    }

    /**
     * Gets the accountNumber.
     *
     * @return the accountNumber.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the accountNumber.
     *
     * @param accountNumber to be set.
     */
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the website.
     *
     * @return the website.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the website.
     *
     * @param website to be set.
     */
    public void setWebsite(final String website) {
        this.website = website;
    }

    /**
     * Gets the photoUrl.
     *
     * @return the photoUrl.
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets the photoUrl.
     *
     * @param photoUrl to be set.
     */
    public void setPhotoUrl(final String photoUrl) {
        this.photoUrl = photoUrl;
    }

    /**
     * Gets the sic.
     *
     * @return the sic.
     */
    public String getSic() {
        return sic;
    }

    /**
     * Sets the sic.
     *
     * @param sic to be set.
     */
    public void setSic(final String sic) {
        this.sic = sic;
    }

    /**
     * Gets the industry.
     *
     * @return the industry.
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the industry.
     *
     * @param industry to be set.
     */
    public void setIndustry(final String industry) {
        this.industry = industry;
    }

    /**
     * Gets the annualRevenue.
     *
     * @return the annualRevenue.
     */
    public String getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Sets the annualRevenue.
     *
     * @param annualRevenue to be set.
     */
    public void setAnnualRevenue(final String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    /**
     * Gets the numberOfEmployees.
     *
     * @return the numberOfEmployees.
     */
    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the numberOfEmployees.
     *
     * @param numberOfEmployees to be set.
     */
    public void setNumberOfEmployees(final String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    /**
     * Gets the ownership.
     *
     * @return the ownership.
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the ownership.
     *
     * @param ownership to be set.
     */
    public void setOwnership(final String ownership) {
        this.ownership = ownership;
    }

    /**
     * Gets the tickerSymbol.
     *
     * @return the tickerSymbol.
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Sets the tickerSymbol.
     *
     * @param tickerSymbol to be set.
     */
    public void setTickerSymbol(final String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
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
     * Gets the rating.
     *
     * @return the rating.
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the rating.
     *
     * @param rating to be set.
     */
    public void setRating(final String rating) {
        this.rating = rating;
    }

    /**
     * Gets the site.
     *
     * @return the site.
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the site.
     *
     * @param site to be set.
     */
    public void setSite(final String site) {
        this.site = site;
    }

    /**
     * Gets the ownerId.
     *
     * @return the ownerId.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the ownerId.
     *
     * @param ownerId to be set.
     */
    public void setOwnerId(final String ownerId) {
        this.ownerId = ownerId;
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
     * Sets the createdDate.
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
     * Gets the lastActivityDate.
     *
     * @return the lastActivityDate.
     */
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the lastActivityDate.
     *
     * @param lastActivityDate to be set.
     */
    public void setLastActivityDate(final String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * Gets the lastViewedDate.
     *
     * @return the lastViewedDate.
     */
    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the lastViewedDate.
     *
     * @param lastViewedDate to be set.
     */
    public void setLastViewedDate(final Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets the lastReferencedDate.
     *
     * @return the lastReferencedDate.
     */
    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the lastReferencedDate.
     *
     * @param lastReferencedDate to be set.
     */
    public void setLastReferencedDate(final Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    /**
     * Gets the jigsaw.
     *
     * @return the jigsaw.
     */
    public String getJigsaw() {
        return jigsaw;
    }

    /**
     * Sets the jigsaw.
     *
     * @param jigsaw to be set.
     */
    public void setJigsaw(final String jigsaw) {
        this.jigsaw = jigsaw;
    }

    /**
     * Gets the jigsawCompanyId.
     *
     * @return the jigsawCompanyId.
     */
    public String getJigsawCompanyId() {
        return jigsawCompanyId;
    }

    /**
     * Sets the jigsawCompanyId.
     *
     * @param jigsawCompanyId to be set.
     */
    public void setJigsawCompanyId(final String jigsawCompanyId) {
        this.jigsawCompanyId = jigsawCompanyId;
    }

    /**
     * Gets the cleanStatus.
     *
     * @return the cleanStatus.
     */
    public String getCleanStatus() {
        return cleanStatus;
    }

    /**
     * Sets the cleanStatus.
     *
     * @param cleanStatus to be set.
     */
    public void setCleanStatus(final String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    /**
     * Gets the accountSource.
     *
     * @return the accountSource.
     */
    public String getAccountSource() {
        return accountSource;
    }

    /**
     * Sets the accountSource.
     *
     * @param accountSource to be set.
     */
    public void setAccountSource(final String accountSource) {
        this.accountSource = accountSource;
    }

    /**
     * Gets the dunsNumber.
     *
     * @return the dunsNumber.
     */
    public String getDunsNumber() {
        return dunsNumber;
    }

    /**
     * Sets the dunsNumber.
     *
     * @param dunsNumber to be set.
     */
    public void setDunsNumber(final String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    /**
     * Gets the tradestyle.
     *
     * @return the tradestyle.
     */
    public String getTradestyle() {
        return tradestyle;
    }

    /**
     * Sets the tradestyle.
     *
     * @param tradestyle to be set.
     */
    public void setTradestyle(final String tradestyle) {
        this.tradestyle = tradestyle;
    }

    /**
     * Gets the naicsCode.
     *
     * @return the naicsCode.
     */
    public String getNaicsCode() {
        return naicsCode;
    }

    /**
     * Sets the naicsCode.
     *
     * @param naicsCode to be set.
     */
    public void setNaicsCode(final String naicsCode) {
        this.naicsCode = naicsCode;
    }

    /**
     * Gets the naicsDesc.
     *
     * @return the naicsDesc.
     */
    public String getNaicsDesc() {
        return naicsDesc;
    }

    /**
     * Sets the naicsDesc.
     *
     * @param naicsDesc to be set.
     */
    public void setNaicsDesc(final String naicsDesc) {
        this.naicsDesc = naicsDesc;
    }

    /**
     * Gets the yearStarted.
     *
     * @return the yearStarted.
     */
    public String getYearStarted() {
        return yearStarted;
    }

    /**
     * Sets the yearStarted.
     *
     * @param yearStarted to be set.
     */
    public void setYearStarted(final String yearStarted) {
        this.yearStarted = yearStarted;
    }

    /**
     * Gets the sicDesc.
     *
     * @return the sicDesc.
     */
    public String getSicDesc() {
        return sicDesc;
    }

    /**
     * Sets the sicDesc.
     *
     * @param sicDesc to be set.
     */
    public void setSicDesc(final String sicDesc) {
        this.sicDesc = sicDesc;
    }

    /**
     * Gets the dandbCompanyId.
     *
     * @return the dandbCompanyId.
     */
    public String getDandbCompanyId() {
        return dandbCompanyId;
    }

    /**
     * Sets the dandbCompanyId.
     *
     * @param dandbCompanyId to be set.
     */
    public void setDandbCompanyId(final String dandbCompanyId) {
        this.dandbCompanyId = dandbCompanyId;
    }

    /**
     * Gets the operatingHoursId.
     *
     * @return the operatingHoursId.
     */
    public String getOperatingHoursId() {
        return operatingHoursId;
    }

    /**
     * Sets the operatingHoursId.
     *
     * @param operatingHoursId to be set.
     */
    public void setOperatingHoursId(final String operatingHoursId) {
        this.operatingHoursId = operatingHoursId;
    }

    /**
     * Gets the customerPriority__c.
     *
     * @return the customerPriority__c.
     */
    public String getCustomerPriority__c() {
        return customerPriority__c;
    }

    /**
     * Sets the customerPriority__c.
     *
     * @param customerPriority__c to be set.
     */
    public void setCustomerPriority__c(final String customerPriority__c) {
        this.customerPriority__c = customerPriority__c;
    }

    /**
     * Gets the sLA__c.
     *
     * @return the sLA__c.
     */
    public String getsLA__c() {
        return sLA__c;
    }

    /**
     * Sets the sLA__c.
     *
     * @param sLA__c to be set.
     */
    public void setsLA__c(final String sLA__c) {
        this.sLA__c = sLA__c;
    }

    /**
     * Gets the active__c.
     *
     * @return the active__c.
     */
    public String getActive__c() {
        return active__c;
    }

    /**
     * Sets the active__c.
     *
     * @param active__c to be set.
     */
    public void setActive__c(final String active__c) {
        this.active__c = active__c;
    }

    /**
     * Gets the numberofLocations__c.
     *
     * @return the numberofLocations__c.
     */
    public String getNumberofLocations__c() {
        return numberofLocations__c;
    }

    /**
     * Sets the numberofLocations__c.
     *
     * @param numberofLocations__c to be set.
     */
    public void setNumberofLocations__c(final String numberofLocations__c) {
        this.numberofLocations__c = numberofLocations__c;
    }

    /**
     * Gets the upsellOpportunity__c.
     *
     * @return the upsellOpportunity__c.
     */
    public String getUpsellOpportunity__c() {
        return upsellOpportunity__c;
    }

    /**
     * Sets the upsellOpportunity__c.
     *
     * @param upsellOpportunity__c to be set.
     */
    public void setUpsellOpportunity__c(final String upsellOpportunity__c) {
        this.upsellOpportunity__c = upsellOpportunity__c;
    }

    /**
     * Gets the sLASerialNumber__c.
     *
     * @return the sLASerialNumber__c.
     */
    public String getsLASerialNumber__c() {
        return sLASerialNumber__c;
    }

    /**
     * Sets the sLASerialNumber__c.
     *
     * @param sLASerialNumber__c to be set.
     */
    public void setsLASerialNumber__c(final String sLASerialNumber__c) {
        this.sLASerialNumber__c = sLASerialNumber__c;
    }

    /**
     * Gets the sLAExpirationDate__c.
     *
     * @return the sLAExpirationDate__c.
     */
    public String getsLAExpirationDate__c() {
        return sLAExpirationDate__c;
    }

    /**
     * Sets the sLAExpirationDate__c.
     *
     * @param sLAExpirationDate__c to be set.
     */
    public void setsLAExpirationDate__c(final String sLAExpirationDate__c) {
        this.sLAExpirationDate__c = sLAExpirationDate__c;
    }
}