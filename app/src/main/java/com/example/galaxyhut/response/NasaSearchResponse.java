package com.example.galaxyhut.response;

import com.example.galaxyhut.models.NasaModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

// This class is for getting multiple images list
public class NasaSearchResponse {
    @SerializedName("items")
    @Expose()
    private List<NasaModel> items;

    public List<NasaModel> getItems(){
        return items;
    }

    @Override
    public String toString() {
        return "NasaSearchResponse{" +
                "items=" + items +
                '}';
    }
}
