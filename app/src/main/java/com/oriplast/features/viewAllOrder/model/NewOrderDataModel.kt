package com.oriplast.features.viewAllOrder.model

import com.oriplast.app.domain.NewOrderColorEntity
import com.oriplast.app.domain.NewOrderGenderEntity
import com.oriplast.app.domain.NewOrderProductEntity
import com.oriplast.app.domain.NewOrderSizeEntity
import com.oriplast.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

