package com.oriplastbreezefsm.features.nearbyuserlist.api

import com.oriplastbreezefsm.app.Pref
import com.oriplastbreezefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.oriplastbreezefsm.features.newcollection.model.NewCollectionListResponseModel
import com.oriplastbreezefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}