package com.himanshu.bindingadapters_customdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.himanshu.bindingadapters_customdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val post = Post("Introduction to Kotlin", "by\n himanshu", "https://cdn.pixabay.com/photo/2023/09/25/00/01/dog-8273965_1280.jpg")

        binding.postXml = post

    }
}