package com.example.appcimatmvvm.Proj_reotrfit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClass {

    private static final String BASE_URL = "https://it-consigantion.azurewebsites.net/api/";

    private static Retrofit getRetrofetInstannce() {

        Gson gson=new GsonBuilder().setLenient().create();


        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson)).build();

    }

    public  static  ApiService getApiservice(){


        return  getRetrofetInstannce().create(ApiService.class);
    }


}
