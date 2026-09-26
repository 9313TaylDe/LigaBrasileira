package com.example.infofut.datas.classes

data class Standings(
    val rank: Int,
    val team: Teams,
    val points: Int,
    val goalsDiff: Int,
    val group: String?,
    val form: String?,
    val status: String?,
    val description: String?,
    val all: Statistics,
    val home: Statistics,
    val away: Statistics,
    val update: String
)
