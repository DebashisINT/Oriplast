package com.oriplast.features.login.model.productlistmodel

import com.oriplast.app.domain.ModelEntity
import com.oriplast.app.domain.ProductListEntity
import com.oriplast.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}