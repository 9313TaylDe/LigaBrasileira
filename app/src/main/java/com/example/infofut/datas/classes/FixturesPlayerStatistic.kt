package com.example.infofut.datas.classes

data class FixturesPlayerStatistic(
    val games: PlayerGames,
    val offsides: Int?,
    val shots: PlayerShot,
    val goals: PlayerGoals,
    val passes: PlayerPasses,
    val tackles: PlayerTackles,
    val duels: PlayerDuels,
    val dribbles: PlayerDribbles,
    val fouls: PlayerFouls,
    val cards: PlayerCards,
    val penalty: PlayerPenalty
)