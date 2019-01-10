package com.renard.rjnetwork.http;

/**
 * Created by Riven_rabbit on 2019/1/10
 */
public class ResponseThrowable extends Exception {
    public int code;
    public String message;

    public ResponseThrowable(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}

