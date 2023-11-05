package com.himanshu.viewmodeltutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    private lateinit var textView: TextView
    private lateinit var button: AppCompatButton

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        setText()

        button.setOnClickListener {
            mainViewModel.increment()
            setText()
        }

    }

    fun setText() {
        textView.text= mainViewModel.count.toString()
    }


}