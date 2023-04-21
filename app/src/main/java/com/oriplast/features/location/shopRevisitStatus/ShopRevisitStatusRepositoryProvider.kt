package com.oriplast.features.location.shopRevisitStatus

import com.oriplast.features.location.shopdurationapi.ShopDurationApi
import com.oriplast.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}