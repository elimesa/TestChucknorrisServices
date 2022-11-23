package com.elimesa.testchucknorrisservices.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.chucknorris.io/jokes/").addConverterFactory(
            GsonConverterFactory.create()
        ).build()
    }
}