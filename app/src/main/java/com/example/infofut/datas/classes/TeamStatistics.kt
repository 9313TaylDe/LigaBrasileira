package com.example.infofut.datas.classes

data class TeamStatistics(
    val league: StatisticsLeague,
    val team: StatisticsTeam,
    val form: String,
    val fixtures: FixturesStatistics,
    val goals: StatisticsGoal,
    val biggest: Biggest,
    val clean_sheet: StatisticsTotal,
    val failed_to_score: StatisticsTotal,
    val penalty: Penalty,
    val lineups: List<Lineup>,
    val cards: Cards
)