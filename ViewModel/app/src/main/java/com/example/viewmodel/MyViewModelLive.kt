package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModelLive: ViewModel() {
    var score: MutableLiveData<Int> = MutableLiveData()
    init{
        score.value = 100
    }

    fun getValue(): Int? = score.value
    fun increaseScore(){
        score.value = score.value?.plus(1)
    }
}