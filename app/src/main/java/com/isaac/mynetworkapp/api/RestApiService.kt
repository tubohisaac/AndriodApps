package com.isaac.mynetworkapp.api

import com.isaac.mynetworkapp.model.StudentInfo
import retrofit2.Call
import retrofit2.Response
import java.net.CacheResponse
import javax.security.auth.callback.Callback
/**
class RestApiService {
   suspend fun addStudent(studentinfo: StudentInfo, onResult:(StudentInfo?) -> Unit){
        val retrofit2 = RetrofitProvider.buildService(PlaceHolderAPI::class.java)
        retrofit2.addStudent(studentinfo).enqueue(
            object : Callback<StudentInfo> {
                override fun onFailure(call: Call<StudentInfo>, t: Throwable) {
                    onResult(null)
                }

            override fun onResponse( call: Call<StudentInfo>, response: Response<StudentInfo>){
                val addedStudentInfo = response.body()
                onResult(addedStudentInfo)
            }})}}

**/
