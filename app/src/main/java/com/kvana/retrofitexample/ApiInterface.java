package com.kvana.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/get-ontologies")

//    Call<MovieResponse> getInformation(String apiKey);

    Call<List<Movie>> getInformation();
}
