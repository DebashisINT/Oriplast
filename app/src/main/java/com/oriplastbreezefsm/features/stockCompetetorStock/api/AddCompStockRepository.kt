package com.oriplastbreezefsm.features.stockCompetetorStock.api

import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.orderList.model.NewOrderListResponseModel
import com.oriplastbreezefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.oriplastbreezefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}