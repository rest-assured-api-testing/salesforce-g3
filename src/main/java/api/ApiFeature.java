package api;

public enum ApiFeature {
    TOKEN("/token"),
    CASES("/sobjects/Case"),
    CASES_ID("/sobjects/Case/{caseId}"),
    CONTACT("/sobjects/Contact"),
    CONTACT_ID("/sobjects/Contact/{contactId}"),
    ACCOUNT("/sobjects/Account"),
    ACCOUNT_ID("/sobjects/Account/{accountId}");

    private String endpoint;

    ApiFeature(String endpoint) {
        this.endpoint = endpoint;
    }

    public String toEndpoint() {
        return endpoint;
    }
}
