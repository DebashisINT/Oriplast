package com.oriplastbreezefsm.features.viewAllOrder.interf

import com.oriplastbreezefsm.app.domain.NewOrderGenderEntity
import com.oriplastbreezefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}