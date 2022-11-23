package com.elimesa.testchucknorrisservices.data.network

import com.elimesa.testchucknorrisservices.data.model.CategoryModel
import retrofit2.Response
import retrofit2.http.GET

interface CategoryApiClient {
    @GET("/categories")
    suspend fun  getAllCategories(): Response<List<CategoryModel>>
}