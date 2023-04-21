package com.oriplast.features.newcollectionreport

import com.oriplast.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}