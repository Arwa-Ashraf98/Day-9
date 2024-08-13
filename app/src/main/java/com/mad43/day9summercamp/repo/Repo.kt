package com.mad43.day9summercamp.repo

import com.mad43.day9summercamp.models.Product
import com.mad43.day9summercamp.network.IRemoteDataSource
import com.mad43.day9summercamp.network.RemoteDataSource

class Repo(private var iRemoteDataSource : IRemoteDataSource = RemoteDataSource()) : IRepo {


    override suspend fun getProductsOnline(): List<Product> {
       return  arwa
    }


}