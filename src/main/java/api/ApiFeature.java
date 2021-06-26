package api;

public enum ApiFeature {

    TOKEN("/token"),
    CASE("/sobjects/Case"),
    CASE_ID("/sobjects/Case/{CASE_ID}"),
    CONTACT("/sobjects/Contact"),
    CONTACT_ID("/sobjects/Contact/{CONTACT_ID}"),
    ACCOUNT("/sobjects/Account"),
    ACCOUNT_ID("/sobjects/Account/{ACCOUNT_ID}"),
    PRODUCT2("/sobjects/Product2"),
    PRODUCT2_ID("/sobjects/Product2/{PRODUCT2_ID}"),
    CAMPAIGN("/sobjects/Campaign"),
    CAMPAIGN_ID("/sobjects/Campaign/{CAMPAIGN_ID}"),
    PRICE_BOOK("/sobjects/PriceBook2"),
    PRICE_BOOK_ID("/sobjects/PriceBook2/{PRICE_BOOK_ID}");

    private String endpoint;

    ApiFeature(String endpoint) {
        this.endpoint = endpoint;
    }

    public String toEndpoint() {
        return endpoint;
    }
}
