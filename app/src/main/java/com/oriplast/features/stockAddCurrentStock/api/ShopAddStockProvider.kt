package com.oriplast.features.stockAddCurrentStock.api

import com.oriplast.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.oriplast.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}