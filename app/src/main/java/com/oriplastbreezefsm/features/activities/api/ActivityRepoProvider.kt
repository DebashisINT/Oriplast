package com.oriplastbreezefsm.features.activities.api

import com.oriplastbreezefsm.features.member.api.TeamApi
import com.oriplastbreezefsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}