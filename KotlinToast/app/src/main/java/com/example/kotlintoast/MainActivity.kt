package com.example.kotlintoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlintoast.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowToast.setOnClickListener{

            Toast.makeText(this, "Hello Himanshu from Main Activity!", Toast.LENGTH_SHORT).show()

            var object_ofExternalClassForToast = ExternalClassForToast()
            object_ofExternalClassForToast.showToast(this);

        }







    }
}