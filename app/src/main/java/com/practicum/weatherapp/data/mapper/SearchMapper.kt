package com.practicum.weatherapp.data.mapper

import com.practicum.weatherapp.data.network.dto.CityDto
import com.practicum.weatherapp.domain.entity.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }