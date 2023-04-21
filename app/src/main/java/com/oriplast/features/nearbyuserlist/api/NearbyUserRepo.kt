package com.oriplast.features.nearbyuserlist.api

import com.oriplast.app.Pref
import com.oriplast.features.nearbyuserlist.model.NearbyUserResponseModel
import com.oriplast.features.newcollection.model.NewCollectionListResponseModel
import com.oriplast.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}