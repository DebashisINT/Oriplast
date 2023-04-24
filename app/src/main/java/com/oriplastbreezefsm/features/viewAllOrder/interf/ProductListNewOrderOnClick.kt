package com.oriplastbreezefsm.features.viewAllOrder.interf

import com.oriplastbreezefsm.app.domain.NewOrderGenderEntity
import com.oriplastbreezefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}