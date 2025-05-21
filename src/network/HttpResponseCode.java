package network;

public enum HttpResponseCode {
    OK("ok",200),
    ERROR("not found",404);

    private final String desc;
    private final int code;

    HttpResponseCode(String desc, int code) {
        this.desc = desc;
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.desc;
    }
}
