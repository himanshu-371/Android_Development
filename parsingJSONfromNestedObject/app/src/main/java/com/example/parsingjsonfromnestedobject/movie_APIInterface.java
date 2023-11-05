package com.example.parsingjsonfromnestedobject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface movie_APIInterface {

//    https://run.mocky.io/       v3/849fc27f-f267-4097-979a-829e85a782a9


    @GET("v3/849fc27f-f267-4097-979a-829e85a782a9")
    Call<JSONResponse> getMovieData();
}
