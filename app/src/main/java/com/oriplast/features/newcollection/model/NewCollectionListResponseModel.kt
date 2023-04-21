package com.oriplast.features.newcollection.model

import com.oriplast.app.domain.CollectionDetailsEntity
import com.oriplast.base.BaseResponse
import com.oriplast.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}