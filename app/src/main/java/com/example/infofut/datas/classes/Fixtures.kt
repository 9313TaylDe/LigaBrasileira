package com.example.infofut.datas.classes

data class Fixtures(
    val id: Int,
    val referee: String?,
    val timezone: String,
    val date: String,
    val timestamp: Long,
    val periods: FixturesPeriods,
    val venue: FixturesVenue,
    val status: FixturesStatus
)