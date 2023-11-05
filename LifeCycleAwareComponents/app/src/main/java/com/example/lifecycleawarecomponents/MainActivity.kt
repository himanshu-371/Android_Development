package com.example.lifecycleawarecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("@@@@","ACTIVITY - ON CREATE")

    }

    override fun onResume() {
        super.onResume()
        Log.d("@@@@","ACTIVITY - ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d("@@@@","ACTIVITY - ON PAUSE")
    }


    override fun onStop() {
        super.onStop()
        Log.d("@@@@","ACTIVITY - ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("@@@@","ACTIVITY - ON DESTROY")
    }


}