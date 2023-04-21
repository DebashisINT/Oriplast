package com.oriplast.features.viewAllOrder.interf

import com.oriplast.app.domain.NewOrderGenderEntity
import com.oriplast.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}