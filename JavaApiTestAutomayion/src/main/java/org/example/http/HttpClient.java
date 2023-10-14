package org.example.http;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class HttpClient {

    private final OkHttpClient client;

    public HttpClient(){
        client = new OkHttpClient().newBuilder()
                .build();
    }

    public HttpResponse get(String url) {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try {
            return new HttpResponse(client.newCall(request).execute());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
