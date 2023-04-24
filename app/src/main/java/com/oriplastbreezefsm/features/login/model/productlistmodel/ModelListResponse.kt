package com.oriplastbreezefsm.features.login.model.productlistmodel

import com.oriplastbreezefsm.app.domain.ModelEntity
import com.oriplastbreezefsm.app.domain.ProductListEntity
import com.oriplastbreezefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}