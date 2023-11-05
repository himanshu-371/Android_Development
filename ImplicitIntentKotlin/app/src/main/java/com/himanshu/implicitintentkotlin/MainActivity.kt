package com.himanshu.implicitintentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val button: AppCompatButton = findViewById(R.id.button)



        button.setOnClickListener {

            val userMsg: String = editText.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,userMsg)
            intent.type = "text/plain"

            startActivity(intent)
//            startActivity(Intent.createChooser(intent,"Send this to :"))

        }





    }
}