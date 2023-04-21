package com.oriplast.features.viewAllOrder.interf

import com.oriplast.app.domain.NewOrderColorEntity
import com.oriplast.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}