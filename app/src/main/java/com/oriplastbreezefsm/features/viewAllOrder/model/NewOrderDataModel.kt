package com.oriplastbreezefsm.features.viewAllOrder.model

import com.oriplastbreezefsm.app.domain.NewOrderColorEntity
import com.oriplastbreezefsm.app.domain.NewOrderGenderEntity
import com.oriplastbreezefsm.app.domain.NewOrderProductEntity
import com.oriplastbreezefsm.app.domain.NewOrderSizeEntity
import com.oriplastbreezefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

