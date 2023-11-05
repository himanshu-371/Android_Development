package com.example.parsingjsonobjectspractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONApi_Interface {

//    https://jsonplaceholder.typicode.com       /posts

    @GET("/posts")
    Call<List<DataModel>> getJSONData();


}
