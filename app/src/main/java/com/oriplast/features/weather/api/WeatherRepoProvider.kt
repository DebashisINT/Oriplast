package com.oriplast.features.weather.api

import com.oriplast.features.task.api.TaskApi
import com.oriplast.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}