package com.example.sportstrackerapp.ui.scores;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ScoresApiClient {
    private static final String BASE_URL = "https://api-web.nhle.com/v1/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
