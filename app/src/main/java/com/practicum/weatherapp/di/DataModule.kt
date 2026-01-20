package com.practicum.weatherapp.di

import android.content.Context
import com.practicum.weatherapp.data.local.db.FavouriteCitiesDao
import com.practicum.weatherapp.data.local.db.FavouriteDatabase
import com.practicum.weatherapp.data.network.api.ApiFactory
import com.practicum.weatherapp.data.network.api.ApiService
import com.practicum.weatherapp.data.repository.FavouriteRepositoryImpl
import com.practicum.weatherapp.data.repository.SearchRepositoryImpl
import com.practicum.weatherapp.data.repository.WeatherRepositoryImpl
import com.practicum.weatherapp.domain.repository.FavouriteRepository
import com.practicum.weatherapp.domain.repository.SearchRepository
import com.practicum.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @[ApplicationScope Binds]
    fun bindFavouriteRepository(impl: FavouriteRepositoryImpl): FavouriteRepository

    @[ApplicationScope Binds]
    fun bindWeatherRepository(impl: WeatherRepositoryImpl): WeatherRepository

    @[ApplicationScope Binds]
    fun bindSearchRepository(impl: SearchRepositoryImpl): SearchRepository

    companion object {

        @[ApplicationScope Provides]
        fun provideApiService(): ApiService = ApiFactory.apiService

        @[ApplicationScope Provides]
        fun provideFavouriteDatabase(context: Context): FavouriteDatabase {
            return FavouriteDatabase.getInstance(context)
        }

        @[ApplicationScope Provides]
        fun provideFavouriteCitiesDao(database: FavouriteDatabase): FavouriteCitiesDao {
            return database.favouriteCitiesDao()
        }
    }
}