package com.example.network.network

import retrofit2.http.GET

interface AppAPis  {

    @GET("search?country=United%20Arab%20Emirates")
    suspend fun getUniversitiesList(
    ): List<UniversityItem>

    companion object{ operator fun invoke() {} }
}