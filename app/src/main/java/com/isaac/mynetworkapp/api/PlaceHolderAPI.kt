package com.isaac.mynetworkapp.api

import com.google.android.material.resources.CancelableFontCallback
import com.isaac.mynetworkapp.model.Item
import com.isaac.mynetworkapp.model.Student
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.net.CacheRequest

interface PlaceHolderAPI {
    @GET( "items")
    suspend fun getItems(): List<Item>

    @POST("students")
    suspend fun addItems(@Body students: Student): Call<Student>
}