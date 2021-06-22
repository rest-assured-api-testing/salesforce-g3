package entities;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Account {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


}