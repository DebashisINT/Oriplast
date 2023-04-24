package com.oriplastbreezefsm.features.lead.api

import com.oriplastbreezefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.oriplastbreezefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}