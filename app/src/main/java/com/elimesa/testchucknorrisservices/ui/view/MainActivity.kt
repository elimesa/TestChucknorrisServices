package com.elimesa.testchucknorrisservices.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.elimesa.testchucknorrisservices.data.model.CategoryModel
import com.elimesa.testchucknorrisservices.data.model.CategoryProvider
import com.elimesa.testchucknorrisservices.databinding.ActivityMainBinding
import com.elimesa.testchucknorrisservices.ui.viewmodel.CategoryViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var categoryMutableList: MutableList<CategoryModel> =
        CategoryProvider.categories.toMutableList()
    private val llmanager = LinearLayoutManager(this)


    private val categoryViewModel: CategoryViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        binding.recycler.layoutManager = llmanager
        binding.recycler.adapter = TODO()
    }

    private fun onItemSelected(category: CategoryModel) {
        Toast.makeText(this, category.name, Toast.LENGTH_SHORT).show()
    }
}