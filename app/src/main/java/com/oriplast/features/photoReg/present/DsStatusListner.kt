package com.oriplast.features.photoReg.present

import com.oriplast.app.domain.ProspectEntity
import com.oriplast.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}