package com.example.whiskyhunterapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {

    private static RetrofitApi instance = null;
    private PostService myApi;

    private RetrofitApi(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PostService.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(PostService.class);
    }

    public static synchronized RetrofitApi getInstance(){
        if (instance ==null) {
            instance = new RetrofitApi();
        }

        return instance;
    }
    public PostService getMyApi(){

        return myApi;
    }

}
