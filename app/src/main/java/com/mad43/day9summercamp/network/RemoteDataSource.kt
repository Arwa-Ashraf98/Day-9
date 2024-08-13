package com.mad43.day9summercamp.network

import com.mad43.day9summercamp.models.Product

class RemoteDataSource : IRemoteDataSource {

    override suspend fun getProduct(): List<Product> {
        return RetrofitConnection.getServices().getProduct().products
    }
}