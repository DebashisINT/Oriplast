package com.oriplast.features.dashboard.presentation.api.dayStartEnd

import com.oriplast.app.Pref
import com.oriplast.base.BaseResponse
import com.oriplast.features.dashboard.presentation.model.DaystartDayendRequest
import com.oriplast.features.dashboard.presentation.model.StatusDayStartEnd
import com.oriplast.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.oriplast.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}