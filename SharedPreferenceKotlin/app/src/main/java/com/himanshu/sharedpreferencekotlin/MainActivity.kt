package com.himanshu.sharedpreferencekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SharedMemory
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextText: EditText = findViewById(R.id.editTextText)
        val editTextText2: EditText = findViewById(R.id.editTextText2)
        val isAdult_: CheckBox = findViewById(R.id.checkBox)
        val button: AppCompatButton = findViewById(R.id.button)
        val button2: AppCompatButton = findViewById(R.id.button2)

        val sharedPreference = getSharedPreferences("Pref1", MODE_PRIVATE)
        val editor = sharedPreference.edit()

        button2.setOnClickListener {
            val name = editTextText.text.toString()
            val age = editTextText2.text.toString().toInt()
            val isAdult = isAdult_.isChecked

            editor.apply{
                putString("NAME",name)
                putInt("AGE",age)
                putBoolean("IS_ADULT", isAdult)
                apply()
            }

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()

        }

        button.setOnClickListener {
            val name = sharedPreference.getString("NAME", null)
            val age = sharedPreference.getInt("AGE", 0)
            val isAdult = sharedPreference.getBoolean("IS_ADULT", false)


            editTextText.setText(name)
            editTextText2.setText(age.toString())
            isAdult_.isChecked = isAdult

            Toast.makeText(this, "Loaded", Toast.LENGTH_SHORT).show()


        }



    }
}