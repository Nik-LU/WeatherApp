package com.practicum.weatherapp.domain.repository

import com.practicum.weatherapp.domain.entity.Forecast
import com.practicum.weatherapp.domain.entity.Weather


interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
}