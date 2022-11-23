package com.elimesa.testchucknorrisservices.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elimesa.testchucknorrisservices.data.model.CategoryModel
import com.elimesa.testchucknorrisservices.data.model.CategoryProvider

class CategoryViewModel : ViewModel() {
    val categoryModel = MutableLiveData<List<CategoryModel>>()

    fun getCategories() {
        val categories = CategoryProvider.categories
        categoryModel.postValue(categories)
    }
}