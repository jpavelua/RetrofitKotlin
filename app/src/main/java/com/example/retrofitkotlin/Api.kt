package com.example.retrofitkotlin

import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("api/v1/employee/1")
    suspend fun getEmployeeData():Response<Employee>
}