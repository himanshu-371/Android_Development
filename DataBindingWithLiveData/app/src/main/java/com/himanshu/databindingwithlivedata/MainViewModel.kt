package com.himanshu.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val quoteLiveData = MutableLiveData("What you give is What you get")

    fun updateQuote() {
        quoteLiveData.value = "You'll see it when you believe it"
    }

}