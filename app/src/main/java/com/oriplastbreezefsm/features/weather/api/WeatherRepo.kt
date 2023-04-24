package com.oriplastbreezefsm.features.weather.api

import com.oriplastbreezefsm.base.BaseResponse
import com.oriplastbreezefsm.features.task.api.TaskApi
import com.oriplastbreezefsm.features.task.model.AddTaskInputModel
import com.oriplastbreezefsm.features.weather.model.ForeCastAPIResponse
import com.oriplastbreezefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}