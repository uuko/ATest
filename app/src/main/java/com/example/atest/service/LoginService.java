package com.example.atest.service;


import com.example.atest.LoginModel;
import com.example.atest.choose.ChooseModel;
import com.example.atest.choose.ChoosenMoModel;
import com.example.atest.login.LoginTokenModel;
import com.example.atest.search.SearchManufactureModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface LoginService {
//    @FormUrlEncoded
//    @POST("api/auth/login")
//    Call<LoginTokenModel> getLoginToken(@Field("account") String account, @Field("password") String password);

    @FormUrlEncoded
    @POST("api/auth/login")
    Observable<LoginTokenModel> rxGetLoginToken(@Field("account") String account, @Field("password") String password);

//    //    @GET("auth/{Token}")
////    Call<LoginModel> getLoginImformation(@Path("Token") String Token);
//    @GET("api/auth/")
//    Call<LoginModel> getLoginImformation(@Query("token") String Token);
//
    @GET("api/auth/")
    Observable<LoginModel> getRxLoginImformation(@Query("token") String Token);

    @GET("api/app-search-customer")
    Observable<List<ChooseModel>> getRxChooseData(@Query("customer_name") String customer_name,
                                                  @Query("token") String token);

    @GET("api/app-search-mo")
    Observable<List<ChoosenMoModel>> getRxChoosenMoData(@Query("mo_id") String mo_id , @Query("token") String token);

    @GET("api/get-manufacture")
    Observable<List<SearchManufactureModel>>getManufactureItem(
            @Query("routing_level") String routing_level,
            @Query("manufacture") String manufacture,
            @Query("customer") String customer,
            @Query("online_date") String online_date,
            @Query("sale_order") String sale_order,
            @Query("token") String token);

//    @GET("api/auth/logout/{Token}")
//    Call<LogoutModel> getLogout(@Query("token") String Token);
//
//    @GET("api/app-search-customer")
//    Call<List<CustomNameModel>> getCustomName(@Query("customer_name") String custom_name ,@Query("token") String token);
//
//    @GET("api/app-search-customer")
//    Observable<List<CustomNameModel>> getRxCustomName(@Query("customer_name") String custom_name ,@Query("token") String token);
//
//    @GET("api/app-search-mo")
//    Call<List<ManufactureModel>> getManufactureId (@Query("mo_id") String mo_id , @Query("token") String token);
//
//    @GET("api/get-manufacture")
//    Call<List<SearchManufactureModel>> getManufactureItem(
//            @Query("routing_level") String routing_level,
//            @Query("manufacture") String manufacture,
//            @Query("customer") String customer,
//            @Query("online_date") String online_date,
//            @Query("sale_order") String sale_order,
//            @Query("token") String token);
//
//
//    //空白頁
//    @GET("api/get-manufacture")
//    Observable<List<SearchManufactureModel>> getrxManufactureItem(
//            @Query("routing_level") String routing_level,
//            @Query("manufacture") String manufacture,
//            @Query("customer") String customer,
//            @Query("online_date") String online_date,
//            @Query("sale_order") String sale_order,
//            @Query("token") String token);
//
//    //前關指令
//    @GET("api/get-prev-manufacture")
//    Call<List<PrevManufactureModel>> getPrevManufature(@Query("so_id") String so_id,
//                                                       @Query("item_id") String item_id,
//                                                       @Query("token") String token);
//
//    //後關指令
//    @GET("api/get-next-part")
//    Observable<List<HoGuanZiLinModel>> getHoGuanZiLin(@Query("sale_order") String sale_order,
//                                                      @Query("id")String id,
//                                                      @Query("token") String token
//    );

}
