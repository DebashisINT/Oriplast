package com.oriplastbreezefsm.features.weather.api

import com.oriplastbreezefsm.features.task.api.TaskApi
import com.oriplastbreezefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}