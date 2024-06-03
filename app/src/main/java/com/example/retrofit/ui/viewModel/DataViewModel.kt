package com.example.retrofit.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.model.FakeStore
import com.example.retrofit.repository.DataRepository
import com.example.retrofit.ui.adapter.DataAdapter
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch


class DataViewModel:ViewModel() {
    private val repository = DataRepository()
    val datas = MutableLiveData<List<FakeStore>>()
    val dataAdapter = DataAdapter(datas.value?: emptyList())
    fun fetchDatas(){
        viewModelScope.launch {
            val response = repository.getData()
            datas.postValue(response)
//            dataAdapter.updateData(response)
             dataAdapter.saveData(response)

        }

    }



}