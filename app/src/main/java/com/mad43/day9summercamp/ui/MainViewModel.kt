package com.mad43.day9summercamp.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mad43.day9summercamp.models.Product
import com.mad43.day9summercamp.repo.IRepo
import com.mad43.day9summercamp.repo.Repo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainViewModel(private var iRepo: IRepo = Repo()) : ViewModel() {

    private val _products: MutableLiveData<List<Product>> = MutableLiveData(emptyList())
    val products: LiveData<List<Product>> get() = _products

    init {
        getProductsOnline()
    }

    private fun getProductsOnline() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = iRepo.getProductsOnline()
            _products.postValue(data)
        }
    }
}