package com.isaac.mynetworkapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.isaac.mynetworkapp.api.RetrofitProvider
import com.isaac.mynetworkapp.model.Item
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val userLiveData = MutableLiveData<List<Item>>()

    fun getItems(){
        viewModelScope.launch {
            userLiveData.postValue(RetrofitProvider.placeHolderAPI.getItems())
        }

        }

       }
