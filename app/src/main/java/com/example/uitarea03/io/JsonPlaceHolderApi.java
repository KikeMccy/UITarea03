package com.example.uitarea03.io;



import android.util.Log;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface JsonPlaceHolderApi {

    //@Headers({"public-merchant-id: bbff765883ae4a80b3bb1b25627abc97"})
    @GET("users.json")
    Call<Listado> getListado();
    //void contacts(Callback<List<>> cb);
}
