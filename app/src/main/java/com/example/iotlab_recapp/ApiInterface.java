package com.example.iotlab_recapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("products")
    Call<List<Model>> getData();
}
