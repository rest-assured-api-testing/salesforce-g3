package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

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
    private boolean IsActive;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean IsArchived;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Description;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean IsStandard;

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
        this.Id = id;
    }

    public String getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        IsDeleted = isDeleted;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public boolean isArchived() {
        return IsArchived;
    }

    public void setArchived(boolean archived) {
        IsArchived = archived;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isStandard() {
        return IsStandard;
    }

    public void setStandard(boolean standard) {
        IsStandard = standard;
    }
}
