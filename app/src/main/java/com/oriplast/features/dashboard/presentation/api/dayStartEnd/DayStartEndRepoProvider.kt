package com.oriplast.features.dashboard.presentation.api.dayStartEnd

import com.oriplast.features.stockCompetetorStock.api.AddCompStockApi
import com.oriplast.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}