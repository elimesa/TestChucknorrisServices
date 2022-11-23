package com.elimesa.testchucknorrisservices.data

import com.elimesa.testchucknorrisservices.data.model.CategoryModel
import com.elimesa.testchucknorrisservices.data.model.CategoryProvider
import com.elimesa.testchucknorrisservices.data.network.CategoryService

class CategoryRepository {
    private val api = CategoryService()

    suspend fun getAllCategories():List<CategoryModel> {
        val response = api.getCategories()
        CategoryProvider.categories = response
        return response
    }
}