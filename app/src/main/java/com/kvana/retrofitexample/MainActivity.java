package com.kvana.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_view;
 private String url = "http://www.cropontology.org/get-ontologies/";
//private static final String TAG = MainActivity.class.getSimpleName();
//
//    private final static String API_KEY = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       getRetrofitArray();


//        if (API_KEY.isEmpty()) {
//
//            return;
//        }
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//
//        Call<MovieResponse> call = apiService.getInformation(API_KEY);
//
//        call.enqueue(new Callback<MovieResponse>() {
//            @Override
//            public void onResponse(Call<MovieResponse>call, Response<MovieResponse> response) {
//                int statusCode = response.code();
//                List<Movie> movies = response.body().getResults();
//                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.titels_main, getApplicationContext()));
//            }
//
//            @Override
//            public void onFailure(Call<MovieResponse>call, Throwable t) {
//                // Log error here since request failed
//                Log.e(TAG, t.toString());
//            }
//        });

    }
    void getRetrofitArray(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface service=retrofit.create(ApiInterface.class);
        Call<List<Movie>> call = service.getInformation();
        call.enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {

            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {

            }
        });
    }
}


