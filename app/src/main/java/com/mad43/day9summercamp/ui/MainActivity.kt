package com.mad43.day9summercamp.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.mad43.day9summercamp.R

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ProductAdapter
    private val viewModel : MainViewModel by viewModels()
    private lateinit var rvProduct : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvProduct = findViewById(R.id.rv_products)
        adapter = ProductAdapter(emptyList())

        viewModel.products.observe(this) {
            adapter.setList(it)
            rvProduct.adapter = adapter
        }
    }
}