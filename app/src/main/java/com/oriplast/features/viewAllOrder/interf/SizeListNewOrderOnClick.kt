package com.oriplast.features.viewAllOrder.interf

import com.oriplast.app.domain.NewOrderProductEntity
import com.oriplast.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}