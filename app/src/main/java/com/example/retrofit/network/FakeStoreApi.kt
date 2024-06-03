package com.example.retrofit.network

import com.example.retrofit.model.FakeStore
import retrofit2.http.GET

interface FakeStoreApi {
    @GET("products")
    suspend fun getData():List<FakeStore>
}