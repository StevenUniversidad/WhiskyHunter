package com.example.whiskyhunterapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitDistilleries {
    private static RetrofitDistilleries instance = null;
    private PostService myApi1;

    private RetrofitDistilleries(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PostService.BASE_URL1).addConverterFactory(GsonConverterFactory.create()).build();
        myApi1 = retrofit.create(PostService.class);
    }

    public static synchronized RetrofitDistilleries getInstance(){
        if (instance ==null) {
            instance = new RetrofitDistilleries();
        }

        return instance;
    }
    public PostService getMyApi(){

        return myApi1;
    }
}
