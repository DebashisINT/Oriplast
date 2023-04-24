package com.oriplastbreezefsm.features.stockAddCurrentStock.api

import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.location.model.ShopRevisitStatusRequest
import com.oriplastbreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.oriplastbreezefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.oriplastbreezefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.oriplastbreezefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}