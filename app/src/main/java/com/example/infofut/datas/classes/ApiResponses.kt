
package com.example.infofut.datas.classes


data class ApiResponses<T>(
    val get: String,
    val parameters: Any,
    val errors: List<Any>,
    val results: Int,
    val paging: Paging,
    val response: T
)