package com.example.galaxyhut.request;

import com.example.galaxyhut.utils.Credentials;
import com.example.galaxyhut.utils.NasaApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder().baseUrl(Credentials.BASE_URL).
                    addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static NasaApi nasaApi = retrofit.create(NasaApi.class);

    public static NasaApi getNasaApi(){
        return nasaApi;
    }
}
