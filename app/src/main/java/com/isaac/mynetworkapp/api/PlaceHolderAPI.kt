package com.isaac.mynetworkapp.api

import com.isaac.mynetworkapp.model.Item
import com.isaac.mynetworkapp.model.StudentInfo
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PlaceHolderAPI {
    @GET( "items")
    suspend fun getItems(): List<Item>

    @POST("students")
    suspend fun addStudent(@Body studentInfo: StudentInfo): Call<StudentInfo>
}