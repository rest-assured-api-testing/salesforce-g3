package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

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
    public Object family;
    @JsonProperty("ExternalDataSourceId")
    public Object externalDataSourceId;
    @JsonProperty("ExternalId")
    public Object externalId;
    @JsonProperty("DisplayUrl")
    public Object displayUrl;
    @JsonProperty("QuantityUnitOfMeasure")
    public Object quantityUnitOfMeasure;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("IsArchived")
    public Boolean isArchived;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;
    @JsonProperty("StockKeepingUnit")
    public Object stockKeepingUnit;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public Date getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public Object getFamily() {
        return family;
    }

    public void setFamily(Object family) {
        this.family = family;
    }

    public Object getExternalDataSourceId() {
        return externalDataSourceId;
    }

    public void setExternalDataSourceId(Object externalDataSourceId) {
        this.externalDataSourceId = externalDataSourceId;
    }

    public Object getExternalId() {
        return externalId;
    }

    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    public Object getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(Object displayUrl) {
        this.displayUrl = displayUrl;
    }

    public Object getQuantityUnitOfMeasure() {
        return quantityUnitOfMeasure;
    }

    public void setQuantityUnitOfMeasure(Object quantityUnitOfMeasure) {
        this.quantityUnitOfMeasure = quantityUnitOfMeasure;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getArchived() {
        return isArchived;
    }

    public void setArchived(Boolean archived) {
        isArchived = archived;
    }

    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    public void setLastReferencedDate(Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    public Object getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    public void setStockKeepingUnit(Object stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }
}
