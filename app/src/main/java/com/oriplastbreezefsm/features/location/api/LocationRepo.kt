package com.oriplastbreezefsm.features.location.api

import com.oriplastbreezefsm.app.Pref
import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.location.model.AppInfoInputModel
import com.oriplastbreezefsm.features.location.model.AppInfoResponseModel
import com.oriplastbreezefsm.features.location.model.GpsNetInputModel
import com.oriplastbreezefsm.features.location.model.ShopDurationRequest
import com.oriplastbreezefsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}