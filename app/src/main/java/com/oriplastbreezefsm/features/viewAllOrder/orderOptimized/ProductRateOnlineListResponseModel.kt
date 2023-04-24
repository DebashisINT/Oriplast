package com.oriplastbreezefsm.features.viewAllOrder.orderOptimized

import com.oriplastbreezefsm.app.domain.ProductOnlineRateTempEntity
import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}