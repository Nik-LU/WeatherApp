package com.practicum.weatherapp

import android.app.Application
import com.practicum.weatherapp.di.ApplicationComponent
import com.practicum.weatherapp.di.DaggerApplicationComponent


class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}