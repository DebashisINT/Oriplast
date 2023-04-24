package com.oriplastbreezefsm.features.viewAllOrder.interf

import com.oriplastbreezefsm.app.domain.NewOrderProductEntity
import com.oriplastbreezefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}