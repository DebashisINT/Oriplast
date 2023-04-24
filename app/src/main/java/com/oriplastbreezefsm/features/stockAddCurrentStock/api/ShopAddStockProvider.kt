package com.oriplastbreezefsm.features.stockAddCurrentStock.api

import com.oriplastbreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.oriplastbreezefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}