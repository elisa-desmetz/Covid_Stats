package com.example.covidstats.api

import com.example.covidstats.models.plantdetails.PlantResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("plants/{id}")
    suspend fun getPlant(
        @Path("id") slug: String
    ): Response<PlantResult>

    @GET("plants/search")
    suspend fun getSearch(
        @Query("q") query: String
    ): Response<SearchResult>

}