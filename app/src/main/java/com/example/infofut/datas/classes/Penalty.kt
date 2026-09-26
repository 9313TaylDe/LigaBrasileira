package com.example.infofut.datas.classes

data class Penalty(
    val scored: PenaltyResult,
    val missed: PenaltyResult,
    val total: Int
)