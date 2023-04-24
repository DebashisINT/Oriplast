package com.oriplastbreezefsm.features.newcollectionreport

import com.oriplastbreezefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}