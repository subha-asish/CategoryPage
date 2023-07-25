package com.example.putatoecategory;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("v1/api/serviceCategory_new")
     Call<Parent> getPost(@Body BodyClass bodyClass);
}
