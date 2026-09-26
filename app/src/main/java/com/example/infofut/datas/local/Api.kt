package com.example.infofut.datas.local

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    val URL_BASE = ""
    val api =
        Retrofit.Builder().baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiServices::class.java)
}