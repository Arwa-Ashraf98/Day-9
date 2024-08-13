package com.mad43.day9summercamp.repo

import com.mad43.day9summercamp.models.Product
import com.mad43.day9summercamp.models.ProductResponse
import retrofit2.Response

interface IRepo {

    suspend fun getProductsOnline() : List<Product>
}