package com.himanshu.bundlepassingkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editTextText)
        val button: AppCompatButton = findViewById(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this,SecondActivity::class.java)

            val userMsg = editText.text.toString()

            intent.putExtra("userMsg",userMsg)

            startActivity(intent)

        }



    }
}