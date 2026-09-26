package com.example.infofut.datas.classes

data class Season(
    val year:Int,
    val start:String,
    val end:String,
    val current:Boolean,
    val coverage: Coverage
)
