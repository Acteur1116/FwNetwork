package com.renard.rjnetwork.http;

/**
 * Created by Riven_rabbit on 2019/1/10
 */
public class BaseResponse<T> {
    private int code;
    private String message;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOk() {
        return code == 0;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
