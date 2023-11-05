package com.himanshu.fragmentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatButton
import com.himanshu.fragmentskotlin.fragments.Fragment1
import com.himanshu.fragmentskotlin.fragments.Fragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: AppCompatButton = findViewById(R.id.button)
        val button2: AppCompatButton = findViewById(R.id.button2)
        val frameLayout: FrameLayout = findViewById(R.id.frameLayout)


        val firstFragment = Fragment1()
        val secondFragment = Fragment2()


        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, firstFragment)
            .addToBackStack(null)
            .commit()

        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, firstFragment)
                .addToBackStack(null)
                .commit()
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, secondFragment)
                .addToBackStack(null)
                .commit()
        }

    }
}