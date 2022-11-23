package com.elimesa.testchucknorrisservices.domain

import com.elimesa.testchucknorrisservices.data.CategoryRepository
import com.elimesa.testchucknorrisservices.data.model.CategoryModel

class GetCategoriesUseCase {
    private val repository = CategoryRepository()

    suspend operator fun invoke(): List<CategoryModel>? = repository.getAllCategories()
}