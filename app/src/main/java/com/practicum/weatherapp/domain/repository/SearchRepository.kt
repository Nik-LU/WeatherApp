package com.practicum.weatherapp.domain.repository

import com.practicum.weatherapp.domain.entity.City


interface SearchRepository {

    suspend fun search(query: String): List<City>
}