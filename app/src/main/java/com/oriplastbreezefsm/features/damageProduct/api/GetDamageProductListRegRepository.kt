package com.oriplastbreezefsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.oriplastbreezefsm.app.FileUtils
import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.NewQuotation.model.*
import com.oriplastbreezefsm.features.addshop.model.AddShopRequestData
import com.oriplastbreezefsm.features.addshop.model.AddShopResponse
import com.oriplastbreezefsm.features.damageProduct.model.DamageProductResponseModel
import com.oriplastbreezefsm.features.damageProduct.model.delBreakageReq
import com.oriplastbreezefsm.features.damageProduct.model.viewAllBreakageReq
import com.oriplastbreezefsm.features.login.model.userconfig.UserConfigResponseModel
import com.oriplastbreezefsm.features.myjobs.model.WIPImageSubmit
import com.oriplastbreezefsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}