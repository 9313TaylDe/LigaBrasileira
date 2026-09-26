package com.example.infofut.datas.classes

data class Venue(
    val id: Int,
    val name: String,
    val code: String?,
    val country: String,
    val founded: Int?,
    val national: Boolean,
    val logo: String?
)
