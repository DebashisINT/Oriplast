package com.oriplastbreezefsm.features.photoReg.present

import com.oriplastbreezefsm.app.domain.ProspectEntity
import com.oriplastbreezefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}