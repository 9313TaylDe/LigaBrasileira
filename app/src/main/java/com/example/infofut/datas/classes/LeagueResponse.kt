package com.example.infofut.datas.classes

data class LeagueResponse(
    val league:String,
    val country:String,
    val seasons: List<Season>
)
