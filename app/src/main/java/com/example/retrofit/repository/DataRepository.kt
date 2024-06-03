package com.example.retrofit.repository

import com.example.retrofit.network.RetrofitInstance

class DataRepository {

    suspend fun getData()  = RetrofitInstance.api.getData()
}