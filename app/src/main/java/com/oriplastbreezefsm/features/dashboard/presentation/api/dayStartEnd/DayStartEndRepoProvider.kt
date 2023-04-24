package com.oriplastbreezefsm.features.dashboard.presentation.api.dayStartEnd

import com.oriplastbreezefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.oriplastbreezefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}