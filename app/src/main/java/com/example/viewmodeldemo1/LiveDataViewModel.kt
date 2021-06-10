package com.example.viewmodeldemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel(startingTotal: Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    init {
        total.value = startingTotal
    }
/*

    fun getTotal(): Int {
        return total
    }
*/


    fun setTotal(input: Int) {
        total.value = (total.value)?.plus(input)
    }
}