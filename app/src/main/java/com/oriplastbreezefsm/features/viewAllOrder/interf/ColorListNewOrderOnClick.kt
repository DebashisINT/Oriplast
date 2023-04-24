package com.oriplastbreezefsm.features.viewAllOrder.interf

import com.oriplastbreezefsm.app.domain.NewOrderColorEntity
import com.oriplastbreezefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}