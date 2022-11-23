package com.elimesa.testchucknorrisservices.data.network

import com.elimesa.testchucknorrisservices.core.RetrofitHelper
import com.elimesa.testchucknorrisservices.data.model.CategoryModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CategoryService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCategories(): List<CategoryModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(CategoryApiClient::class.java).getAllCategories()
            response.body() ?: emptyList()
        }
    }
}