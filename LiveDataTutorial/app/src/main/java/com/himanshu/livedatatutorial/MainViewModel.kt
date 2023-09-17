package com.himanshu.livedatatutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val factsLiveDataObject = MutableLiveData<String>("I am a fact.")

    val factsLiveData: LiveData<String>
        get() = factsLiveDataObject

    fun updateLiveData(){
        factsLiveDataObject.value = "Another Fact."
    }

}