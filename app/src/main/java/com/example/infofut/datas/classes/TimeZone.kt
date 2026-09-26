package com.example.infofut.datas.classes

data class TimeZone(
    val get: String,
    val parameters: List<Any>,
    val errors: List<Any>,
    val results: Int,
    val paging: Paging,
    val response: List<String>
)
