package com.example.androidwallpaper

import android.app.WallpaperManager
import android.content.ContentValues
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.androidwallpaper.databinding.ActivityFinalWallpaperBinding
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.io.File
import java.io.IOException
import java.io.OutputStream
import java.net.URL
import java.util.Objects
import java.util.Random

class FinalWallpaper : AppCompatActivity() {

    lateinit var binding: ActivityFinalWallpaperBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinalWallpaperBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val url = intent.getStringExtra("link")
        val urlImage = URL(url)

        binding.finalWallpaper
        Glide.with(this).load(url).into(binding.finalWallpaper)

        binding.btnSetWallpaper.setOnClickListener{
            //set wallpaper

            Toast.makeText(this, "Wallpaper Applied", Toast.LENGTH_SHORT).show()

            val result: Deferred<Bitmap?> = GlobalScope.async {
                urlImage.toBitmap()
            }

            GlobalScope.launch(Dispatchers.Main) {


                val wallpaperManager = WallpaperManager.getInstance(applicationContext)
                wallpaperManager.setBitmap(result.await())

            }



        }



        binding.btnDownload.setOnClickListener{
            //download wallpaper


            val result: Deferred<Bitmap?> = GlobalScope.async {
                urlImage.toBitmap()
            }

            GlobalScope.launch(Dispatchers.Main) {


                saveImage(result.await())

            }


        }


    }

    fun URL.toBitmap(): Bitmap?{
        return try{
            BitmapFactory.decodeStream(openStream())
        } catch (e: IOException){
            null
        }
    }

    private fun saveImage(image: Bitmap?) {

    val random1 = Random().nextInt(520985)
    val random2 = Random().nextInt( 520985)

    val name = "AMOLED-${random1 + random2}"

    val data: OutputStream
    try {
        val resolver = contentResolver
        val contentValues = ContentValues()
        contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, "$name.jpg")
        contentValues.put(MediaStore. MediaColumns.MIME_TYPE, "image/jpg")
        contentValues.put(
            MediaStore.MediaColumns. RELATIVE_PATH,
            Environment.DIRECTORY_PICTURES + File.separator + "Amoled Wallpaper"
        )
        val imageUri =
            resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
        data = resolver.openOutputStream(Objects.requireNonNull(imageUri)!!)!!
        image?.compress (Bitmap.CompressFormat.JPEG, 100, data)
        Objects.requireNonNull<OutputStream?>(data)
        Toast.makeText( this, "Image Saved", Toast.LENGTH_SHORT).show()
    } catch (e: Exception) {
        Toast.makeText(  this, "Image Not Saved", Toast.LENGTH_SHORT).show()
    }
    }






}