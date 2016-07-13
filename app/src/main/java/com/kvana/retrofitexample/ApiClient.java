package com.kvana.retrofitexample;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Kvana Inc 12 on 7/13/2016.
 */
public class ApiClient {
//
//    @GET("http://www.cropontology.org/get-ontologies")
//    Call<Movie> getStudentDetails();

    public static final String BASE_URL = "http://www.cropontology.org/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
