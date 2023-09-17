package com.example.androidwallpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.androidwallpaper.Fragments.DownloadFragment
import com.example.androidwallpaper.Fragments.HomeFragment
import com.example.androidwallpaper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.icHome.setOnClickListener{
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            replaceFragment(HomeFragment())
        }

        binding.icDownload.setOnClickListener{
            Toast.makeText(this, "Download", Toast.LENGTH_SHORT).show()
            replaceFragment(DownloadFragment())
        }



    }

    fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentReplace, fragment)
        transaction.commit()

    }

}