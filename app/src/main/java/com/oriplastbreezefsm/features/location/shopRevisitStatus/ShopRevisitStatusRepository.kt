package com.oriplastbreezefsm.features.location.shopRevisitStatus

import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.location.model.ShopDurationRequest
import com.oriplastbreezefsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}