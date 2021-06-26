package configuration;

public enum InvalidValuesEnum {

    INVALID_CASE_ID("abcd1234"),
    INVALID_CONTACT_ID("abcd1234"),
    INVALID_ACCOUNT_ID("abcd1234"),
    INVALID_PRODUCT2_ID("abcd1234"),
    INVALID_CAMPAIGN_ID("abcd1234"),
    INVALID_PRICE_BOOK_ID("abcd1234");

    private String id;

    InvalidValuesEnum(String  responseCode) {
        this.id = responseCode;
    }

    public String value() {
        return id;
    }
}
