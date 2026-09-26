package com.example.infofut.datas.classes

data class FixturesScore(
    val halftime: FixturesScorePeriod,
    val fulltime: FixturesScorePeriod,
    val extratime: FixturesScorePeriod,
    val penalty: FixturesScorePeriod
)