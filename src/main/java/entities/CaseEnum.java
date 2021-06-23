package entities;

public enum CaseEnum {
    NEW("New"),
    WORKING("Working"),
    ESCALATED("Escalated");

    private String status;

    CaseEnum(String status) {
        this.status = status;
    }

    public String toStatus() {
        return status;
    }
}
