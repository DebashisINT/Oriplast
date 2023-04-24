package com.oriplastbreezefsm.features.location.shopRevisitStatus

import com.oriplastbreezefsm.features.location.shopdurationapi.ShopDurationApi
import com.oriplastbreezefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}