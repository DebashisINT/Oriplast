package com.oriplast.features.location.shopRevisitStatus

import com.oriplast.base.BaseResponse
import com.oriplast.features.location.model.ShopDurationRequest
import com.oriplast.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}