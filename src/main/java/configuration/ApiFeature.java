package configuration;

public enum ApiFeature {

    TOKEN("/token"),
    CASES("/sobjects/Case"),
    CASES_ID("/sobjects/Case/{caseId}"),
    CONTACT("/sobjects/Contact"),
    CONTACT_ID("/sobjects/Contact/{contactId}"),
    ACCOUNT("/sobjects/Account"),
    ACCOUNT_ID("/sobjects/Account/{accountId}"),
    PRODUCT2("/sobjects/Product2"),
    PRODUCT2_ID("/sobjects/Product2/{product2Id}"),
    CAMPAIGN("/sobjects/Campaign"),
    CAMPAIGN_ID("/sobjects/Campaign/{campaignId}"),
    PRICE_BOOK("/sobjects/PriceBook2"),
    PRICE_BOOK_ID("/sobjects/PriceBook2/{priceId}");

    private String endpoint;

    ApiFeature(String endpoint) {
        this.endpoint = endpoint;
    }

    public String toEndpoint() {
        return endpoint;
    }
}
