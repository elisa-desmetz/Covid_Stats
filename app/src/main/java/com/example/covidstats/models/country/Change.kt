package com.example.covidstats.models.country

data class Change(
    val total_cases: Int?,
    val active_cases: Int?,
    val deaths: Int?,
    val recovered: Int?,
    val critical: Int?,
    val tested: Int?,
    val death_ratio: Double?,
    val recovery_ratio: Double?
)