package com.renard.rjnetwork.http.interceptor;

import com.renard.rjnetwork.http.download.ProgressResponseBody;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by Riven_rabbit on 2019/1/10
 */
public class ProgressInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response =chain.proceed(chain.request());
        return response.newBuilder()
                .body(new ProgressResponseBody(response.body()))
                .build();
    }
}
