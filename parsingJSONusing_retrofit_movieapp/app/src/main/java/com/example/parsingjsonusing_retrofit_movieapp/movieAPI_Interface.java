package com.example.parsingjsonusing_retrofit_movieapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


//https://run.mocky.io/v3/81b4f97b-0d34-42ed-9019-445c18ac7c8a

//         https://run.mocky.io/       v3/81b4f97b-0d34-42ed-9019-445c18ac7c8a

public interface movieAPI_Interface {

    @GET("v3/81b4f97b-0d34-42ed-9019-445c18ac7c8a")
    Call<ArrayList<movieDataModelClass>> getMovieData();

}
