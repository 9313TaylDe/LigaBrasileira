package com.example.infofut.datas.classes

data class Teams(
    val get: String,
    val parameters: List<Any>,
    val errors: List<Any>,
    val paging: Paging,
    val results: Int,
    val response: List<Int>

)
