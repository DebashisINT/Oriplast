package com.oriplast.features.viewAllOrder.orderOptimized

import com.oriplast.app.domain.ProductOnlineRateTempEntity
import com.oriplast.base.BaseResponse
import com.oriplast.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}