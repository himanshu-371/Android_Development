package com.example.parsingjsona_array_movieapp2;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface movie_APIInterface {


//        https://run.mocky.io/      v3/3853edce-5a10-4a92-87e9-1cc871c0311c


        @GET("v3/3853edce-5a10-4a92-87e9-1cc871c0311c")
        Call<JSONResponse> getMovieData();



}
