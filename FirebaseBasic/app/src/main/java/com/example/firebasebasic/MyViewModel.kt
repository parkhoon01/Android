package com.example.firebaseapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val dataSource = DataSource()
    fun getMovie() : LiveData<MutableList<Movie>> {
        val data = MutableLiveData<MutableList<Movie>>()
        dataSource.getData().observeForever {
            data.value = it
        }
        return data
    }
}