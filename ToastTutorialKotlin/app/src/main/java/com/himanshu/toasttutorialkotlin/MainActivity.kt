package com.himanshu.toasttutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val defaultToastBtn: AppCompatButton = findViewById(R.id.appCompatButton)
        val customToastBtn: AppCompatButton = findViewById(R.id.appCompatButton2)

        defaultToastBtn.setOnClickListener {
            Toast.makeText(this,"Hello, I am default Toast",Toast.LENGTH_LONG).show()
        }

        customToastBtn.setOnClickListener {
            val toast = Toast(this)
            toast.view = layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.toastRootLayout))
            toast.duration = Toast.LENGTH_LONG
            toast.show()
        }




    }
}