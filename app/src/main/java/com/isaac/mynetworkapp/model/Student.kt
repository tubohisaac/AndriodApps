package com.isaac.mynetworkapp.model

import com.google.gson.annotations.SerializedName

data class Student(
    @SerializedName("name")
    val name: String,
    @SerializedName("seat")
    val seat : Int,
    @SerializedName("class")
    val studentclass : Char
)
