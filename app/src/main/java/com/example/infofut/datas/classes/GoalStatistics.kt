package com.example.infofut.datas.classes

data class GoalStatistics(
    val total: HomeAwayTotal,
    val average: Average,
    val minute: Map<String, MinuteStatistics>,
    val under_over: Map<String, UnderOver>
)