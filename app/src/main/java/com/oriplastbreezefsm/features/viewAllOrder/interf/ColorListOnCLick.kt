package com.oriplastbreezefsm.features.viewAllOrder.interf

import com.oriplastbreezefsm.app.domain.NewOrderGenderEntity
import com.oriplastbreezefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}