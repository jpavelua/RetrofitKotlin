package com.example.retrofitkotlin

import com.google.gson.annotations.SerializedName

data class Employee(
    @SerializedName("id")
    var employee_id: Int,
    @SerializedName("employee_name")
    var employee_name: String,
    @SerializedName("employee_age")
    var employee_age: Int,
    @SerializedName("employee_salary")
    var employee_salary: Int
)
