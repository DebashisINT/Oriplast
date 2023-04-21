package com.oriplast.features.location.api

import com.oriplast.features.location.shopdurationapi.ShopDurationApi
import com.oriplast.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}