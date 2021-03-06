package com.example.rentshare;

import com.example.rentshare.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

    @GET("all")
    Call<List<User>> getUsers();
//
    @POST("load")
    Call<Void> createUser(@Body User user);

//    @FormUrlEncoded
//    @POST("/load")
//    Call<User> createUser(
//            @Field("name") String name,
//            @Field("email") String email
//    );

//    @FormUrlEncoded
//    @POST("load")
//    Call<User> createUser(@FieldMap Map<String, String> fields);
}
