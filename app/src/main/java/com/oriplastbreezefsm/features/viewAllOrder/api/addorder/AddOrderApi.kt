package com.oriplastbreezefsm.features.viewAllOrder.api.addorder

import com.oriplastbreezefsm.app.NetworkConstant
import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.returnsOrder.ReturnRequest
import com.oriplastbreezefsm.features.timesheet.api.TimeSheetApi
import com.oriplastbreezefsm.features.timesheet.model.EditDeleteTimesheetResposneModel
import com.oriplastbreezefsm.features.viewAllOrder.model.AddOrderInputParamsModel
import com.oriplastbreezefsm.features.viewAllOrder.model.NewOrderSaveApiModel
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Saikat on 01-10-2018.
 */
interface AddOrderApi {
    @FormUrlEncoded
    @POST("Order/AddOrder")
    fun addOrder(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("shop_id") shop_id: String,
                            @Field("order_id") order_id: String, @Field("order_amount") order_amount: String, @Field("description") description: String,
                 @Field("collection") collection: String, @Field("order_date") order_date: String):
            Observable<BaseResponse>


    @POST("RubyFoodLead/OrderReturnSave")
    fun addReturn(@Body ReturnRequest: ReturnRequest?): Observable<BaseResponse>



    @POST("Order/AddOrder")
    fun addNewOrder(@Body addOrder: AddOrderInputParamsModel): Observable<BaseResponse>

    @Multipart
    @POST("FileUpload/OrderSignature")
    fun addNewOrderWithImage(@Query("data") addOrder: String, @Part logo_img_data: MultipartBody.Part?): Observable<BaseResponse>



    @POST("OrderWithProductAttribute/OrderWithProductAttribute")
    fun addOrderNewOrderScr(@Body addOrder: NewOrderSaveApiModel): Observable<BaseResponse>

    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): AddOrderApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(AddOrderApi::class.java)
        }

        fun createImage(): AddOrderApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(AddOrderApi::class.java)
        }
    }
}