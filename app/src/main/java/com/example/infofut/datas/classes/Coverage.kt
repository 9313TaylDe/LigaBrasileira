package com.example.infofut.datas.classes

data class Coverage(
    val fixtures:FixturesCoverage,
    val standings:Boolean,
    val players: Boolean,
    val top_scorers: Boolean,
    val top_assists: Boolean,
    val top_cards: Boolean,
    val injuries: Boolean,
    val predictions: Boolean,
    val odds: Boolean
)
