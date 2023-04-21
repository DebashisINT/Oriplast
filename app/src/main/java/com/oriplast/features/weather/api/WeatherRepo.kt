package com.oriplast.features.weather.api

import com.oriplast.base.BaseResponse
import com.oriplast.features.task.api.TaskApi
import com.oriplast.features.task.model.AddTaskInputModel
import com.oriplast.features.weather.model.ForeCastAPIResponse
import com.oriplast.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}