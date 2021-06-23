package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class CreatedObject {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String Id;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private boolean success;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private List<String> errors;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
