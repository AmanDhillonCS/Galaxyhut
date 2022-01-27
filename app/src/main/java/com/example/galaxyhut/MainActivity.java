package com.example.galaxyhut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.galaxyhut.models.NasaModel;
import com.example.galaxyhut.request.Service;
import com.example.galaxyhut.response.NasaSearchResponse;
import com.example.galaxyhut.utils.Credentials;
import com.example.galaxyhut.utils.NasaApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getRetrofitResponse();
            }
        });
    }

    private void getRetrofitResponse(){
        NasaApi nasaApi = Service.getNasaApi();

        Call<NasaSearchResponse> responseCall = nasaApi.searchItems("Mars", "image");

        responseCall.enqueue((new Callback<NasaSearchResponse>() {
            @Override
            public void onResponse(Call<NasaSearchResponse> call, Response<NasaSearchResponse> response) {
                if(response.code()==200){
                    Log.v("Tag","the reponse " + response.body().toString());

                    List<NasaModel> items = new ArrayList<>(response.body().getItems());

                    for(NasaModel item: items){
                        Log.v("tag", "The List " + item.getCollection());
                    }

                }
                else {
                    try {
                        Log.v("Tag", " error" + response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<NasaSearchResponse> call, Throwable t) {

            }
        }));
    }
}