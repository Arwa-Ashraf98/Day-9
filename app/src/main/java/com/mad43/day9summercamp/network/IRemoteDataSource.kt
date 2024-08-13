package com.mad43.day9summercamp.network

import com.mad43.day9summercamp.models.Product

interface IRemoteDataSource {

    suspend fun getProduct() : List<Product>
}