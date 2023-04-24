package com.oriplastbreezefsm.features.document.api

import com.oriplastbreezefsm.features.dymanicSection.api.DynamicApi
import com.oriplastbreezefsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}