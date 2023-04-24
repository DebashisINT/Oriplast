package com.oriplastbreezefsm.features.orderList.model

import com.oriplastbreezefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}