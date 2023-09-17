package com.example.kotlintoast

import android.content.Context
import android.widget.Toast

class ExternalClassForToast {

    fun showToast(context: Context){
        Toast.makeText(context, "Hello Himanshu from External class ", Toast.LENGTH_SHORT).show()
    }


}