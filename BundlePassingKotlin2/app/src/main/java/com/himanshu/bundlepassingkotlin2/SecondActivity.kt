package com.himanshu.bundlepassingkotlin2

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
class SecondActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textView)

        val messageToDisplay = intent.getSerializableExtra("EXTRA_PERSON", Person::class.java)

        textView.text = messageToDisplay.toString()




    }


}