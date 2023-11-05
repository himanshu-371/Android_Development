package com.example.retrofitsimplejson;

import retrofit2.Call;
import retrofit2.http.GET;

public interface retrofitAPI_Interface {



       //https://run.mocky.io/           v3/3bab8dc3-41cd-47c0-affd-37c757be9ae7

    @GET("v3/3bab8dc3-41cd-47c0-affd-37c757be9ae7")
    Call<retrofit_dataModelClass> getJSonData();


}
