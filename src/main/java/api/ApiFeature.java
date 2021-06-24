package api;

public enum ApiFeature {
    TOKEN("/token"),
    CASES("/sobjects/Case"),
    CASES_ID("/sobjects/Case/{caseId}"),
    CONTACT("/sobjects/Contact"),
    CONTACT_ID("/sobjects/Contact/{contactId}"),
    ACCOUNT("/sobjects/Account"),
    ACCOUNT_ID("/sobjects/Account/{accountId}"),
    PRODUCTS("/sobjects/Products2"),
    PRODUCTS_ID("/sobjects/Products2/{productId}"),
    CAMPAIGN("/sobjects/Campaign"),
    CAMPAIGN_ID("/sobjects/Campaign/{campaignId}"),
    PRICE_BOOK("/sobjects/PriceBook"),
    PRICE_BOOK_ID("/sobjects/PriceBook/{priceId}");

    private String endpoint;

    ApiFeature(String endpoint) {
        this.endpoint = endpoint;
    }

    public String toEndpoint() {
        return endpoint;
    }
}
