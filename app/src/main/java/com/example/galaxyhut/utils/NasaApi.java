package com.example.galaxyhut.utils;

import com.example.galaxyhut.response.NasaSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NasaApi {

    // Search for Images

    @GET
    Call<NasaSearchResponse> searchItems(
        @Query("q") String q,
        @Query("media_type") String media_type
    );

}
