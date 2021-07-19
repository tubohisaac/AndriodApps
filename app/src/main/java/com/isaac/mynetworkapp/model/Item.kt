package com.isaac.mynetworkapp.model

import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName( " id")
    val id : Int,
    @SerializedName("name")
    val name : String,
    @SerializedName("price")
    val price: Int
)
