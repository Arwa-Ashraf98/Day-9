package com.mad43.day9summercamp.network

import com.mad43.day9summercamp.models.Product
import com.mad43.day9summercamp.models.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    //  interface has end points that call api
    @GET("product")
    suspend fun getProduct() : ProductResponse

    @GET("product/{id}")
    suspend fun getProductById(@Path("id") id: Int) : Product
}