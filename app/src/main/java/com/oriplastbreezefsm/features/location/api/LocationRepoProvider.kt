package com.oriplastbreezefsm.features.location.api

import com.oriplastbreezefsm.features.location.shopdurationapi.ShopDurationApi
import com.oriplastbreezefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}