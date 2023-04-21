package com.oriplast.features.lead.api

import com.oriplast.features.NewQuotation.api.GetQuotListRegRepository
import com.oriplast.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}