package com.example.movieapp.request;

import com.example.movieapp.Utils.Credentials;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class service {

   private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
           .baseUrl(Credentials.BASE_URL)
           .addConverterFactory(GsonConverterFactory.create());


   private static Retrofit retrofit = retrofitBuilder.build();

   private static MovieApi movieApi

}
