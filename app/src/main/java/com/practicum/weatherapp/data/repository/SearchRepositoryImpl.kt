package com.practicum.weatherapp.data.repository

import com.practicum.weatherapp.data.mapper.toEntities
import com.practicum.weatherapp.data.network.api.ApiService
import com.practicum.weatherapp.domain.entity.City
import com.practicum.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}