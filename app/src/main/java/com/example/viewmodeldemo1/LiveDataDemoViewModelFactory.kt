package com.example.viewmodeldemo1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LiveDataDemoViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LiveDataViewModel::class.java)) {
            return LiveDataViewModel(startingTotal) as T

        }

        throw IllegalArgumentException("Unknown view model class")
    }
}