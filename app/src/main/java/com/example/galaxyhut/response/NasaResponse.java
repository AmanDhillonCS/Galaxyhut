package com.example.galaxyhut.response;

import com.example.galaxyhut.models.NasaModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// This class is for single Nasa request
public class NasaResponse {
    // 1. find the Collection object
    @SerializedName("Items")
    @Expose
    private NasaModel nasa;
    public NasaModel  getNasa(){
        return nasa;
    }

    @Override
    public String toString() {
        return "NasaResponse{" +
                "nasa=" + nasa +
                '}';
    }
}
