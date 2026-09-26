package com.example.infofut.datas.classes

data class FixturesEvent(
    val time: FixturesEventTime,
    val team: StatisticsTeam,
    val player: FixturesEventPlayer,
    val assist: FixturesEventAssist,
    val type: String,
    val detail: String?,
    val comments: String?
)