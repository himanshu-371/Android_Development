package com.himanshu.explicitintentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: AppCompatButton = findViewById(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

    }
}