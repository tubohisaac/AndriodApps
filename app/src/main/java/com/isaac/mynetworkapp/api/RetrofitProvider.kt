package com.isaac.mynetworkapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  RetrofitProvider {
    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://ict-yep-backend.herokuapp.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    val placeHolderAPI = retrofit.create(PlaceHolderAPI::class.java)

    fun <T> buildService( service:Class<T>): T {
        return retrofit.create(service)
    }



}


