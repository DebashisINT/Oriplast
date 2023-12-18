package com.oriplastbreezefsm.features.contacts

import com.oriplastbreezefsm.app.domain.CompanyMasterEntity
import com.oriplastbreezefsm.app.domain.SourceMasterEntity
import com.oriplastbreezefsm.app.domain.StageMasterEntity
import com.oriplastbreezefsm.app.domain.StatusMasterEntity
import com.oriplastbreezefsm.app.domain.TypeMasterEntity
import com.oriplastbreezefsm.base.BaseResponse

data class ContactGr(var gr_id:String="",var gr_name:String="")
data class ContactDtls(val gr_name:String="",val name:String="",val number:String="",val isTick:Boolean = false)

data class ContactMasterRes(var company_list:ArrayList<CompanyMasterEntity>):BaseResponse()
data class TypeMasterRes(var type_list:ArrayList<TypeMasterEntity>):BaseResponse()
data class StatusMasterRes(var status_list:ArrayList<StatusMasterEntity>):BaseResponse()
data class SourceMasterRes(var source_list:ArrayList<SourceMasterEntity>):BaseResponse()
data class StageMasterRes(var stage_list:ArrayList<StageMasterEntity>):BaseResponse()
