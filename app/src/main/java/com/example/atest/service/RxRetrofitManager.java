package com.example.atest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RxRetrofitManager {
    private static RxRetrofitManager mInstance=new RxRetrofitManager();
    private LoginService loginService;
    Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    String BASE_URL="http://10.1.1.71:8000/";
    private RxRetrofitManager(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//新的配置
                .baseUrl(BASE_URL)
                .build();
        loginService=retrofit.create(LoginService.class);
    }

    public  static  RxRetrofitManager getInstance(){
        return mInstance;
    }
    public LoginService getLoginService(){
        return loginService;
    }

    public LoginService RxgetLoginToken(){return loginService; }

    public LoginService RxgetLoginData(){return loginService; }

    public LoginService RxgetCustomer(){return  loginService;}
    public LoginService RxgetMoId(){return  loginService;}

    public  LoginService RxgetManufactureId(){return  loginService;}


    public  LoginService RxgetManufactureData(){
        return loginService;
    }
    public LoginService getHoGuanZiLin(){
        return loginService;
    }
}
