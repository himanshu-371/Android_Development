package com.himanshu.roomdatabasetutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //database object k liye singleton pattern use hota hai in industry level apps
        //yeah bas testing k liye hai humne seekhne k liye banaya hai
//        database= databaseBuilder(applicationContext,
//            ContactDatabase::class.java,
//            "ContactDB").build()

        database = ContactDatabase.getDatabase(this)


        GlobalScope.launch {
            val contact1 = Contact(0, "Himanshu", "126")
            database.contactDao().insertContact(contact1)
        }




    }

    fun getData(view: View) {
        database.contactDao().getContact().observe(this, Observer {
            Log.d("@@@@",it.toString())
        })
    }


}