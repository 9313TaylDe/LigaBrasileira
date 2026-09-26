package com.example.infofut.datas.classes

data class FixtureResponse(
    val fixture: Fixtures,
    val league: FixturesLeague,
    val teams: FixturesTeam,
    val goals: FixturesGoals,
    val score: FixturesScore
)