package com.oriplastbreezefsm.features.survey.api

import com.oriplastbreezefsm.features.photoReg.api.GetUserListPhotoRegApi
import com.oriplastbreezefsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}