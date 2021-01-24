package com.example.retrofitkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository):ViewModel() {
    val repoResponse:MutableLiveData<Response<Employee>> = MutableLiveData()
    fun getEmployeeData(){
        viewModelScope.launch {
            val response = repository.getEmployeeData()
            repoResponse.value = response
        }
    }
}