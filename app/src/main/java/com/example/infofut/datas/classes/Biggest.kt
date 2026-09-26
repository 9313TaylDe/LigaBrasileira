package com.example.infofut.datas.classes

data class Biggest(
    val streak: Streak,
    val wins: HomeAwayScore,
    val loses: HomeAwayScore,
    val goals: BiggestGoals
)