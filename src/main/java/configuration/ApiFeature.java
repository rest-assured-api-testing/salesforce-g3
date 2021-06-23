package configuration;

public enum ApiFeature {
    token("/token"),
    CASES("/sobjects/Case"),
    CASES_ID("/sobjects/Case/{caseId}"),
    CONTACT("/sobjects/Contact"),
    CONTACT_ID("/sobjects/Contact/{contactId}"),
    ACCOUNT("/sobjects/Account"),
    ACCOUNT_ID("/sobjects/Account/{accountId}"),
    PRICEBOOK("sobjects/Pricebook2/"),
    PRICEBOOK_ID("sobjects/Pricebook2/{priceBookId}"),
    CAMPAIGN("sobjects/Campaign/"),
    CAMPAIGN_ID("sobjects/Campaign/{campaignId}");
    private String endpoint;
    ApiFeature(String endpoint) {
        this.endpoint = endpoint;
    }
    public String toEndpoint() {
        return endpoint;
    }
}
