package com.himanshu.bundlepassingkotlin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: AppCompatButton = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editTextText)
        val editText2: EditText = findViewById(R.id.editTextText2)
        val editText3: EditText = findViewById(R.id.editTextText3)

        button.setOnClickListener {

            Intent(this, SecondActivity::class.java).also {

                val name = editText.text.toString()
                val age = editText2.text.toString()
                val place = editText3.text.toString()

                val person = Person(name, age, place)

                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }

        }


    }
}