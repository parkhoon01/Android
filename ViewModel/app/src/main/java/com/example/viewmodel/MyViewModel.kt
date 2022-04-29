package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel(private var counter: Int): ViewModel() {

    fun getCurrentVal() = counter
    fun increaseCounter() = ++counter
}