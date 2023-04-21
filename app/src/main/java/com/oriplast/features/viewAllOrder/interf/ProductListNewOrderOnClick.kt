package com.oriplast.features.viewAllOrder.interf

import com.oriplast.app.domain.NewOrderGenderEntity
import com.oriplast.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}