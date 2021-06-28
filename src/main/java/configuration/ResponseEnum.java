package configuration;

public enum ResponseEnum {

    OK(200),
    OKS(201),
    CREATED(201),
    UPDATED(201),
    NO_CONTENT(204),
    BAD_REQUEST(400),
    NOT_FOUND(404),
    SERVER_ERROR(500),
    NOT_ALLOWED(405);

    private int responseCode;

    ResponseEnum(int responseCode) {
        this.responseCode = responseCode;
    }

    public int value() {
        return responseCode;
    }
}
