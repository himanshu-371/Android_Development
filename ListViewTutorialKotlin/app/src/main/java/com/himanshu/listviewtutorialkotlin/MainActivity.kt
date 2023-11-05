package com.himanshu.listviewtutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview: ListView = findViewById(R.id.lv)
        val spinner: Spinner = findViewById(R.id.spinner)
        val automcompletetextview: AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)

        val programmingNames = arrayOf("C++", "C", "C#", "Python", "Java", "Django", "Kotlin", "ExpressJS", "MongoDB", "C++", "C", "C#", "Python", "Java", "Django", "Kotlin", "ExpressJS", "MongoDB")


        //listview
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            programmingNames)

        listview.adapter = arrayAdapter

        //onClick
        listview.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "You clicked on ${programmingNames[i]}", Toast.LENGTH_SHORT).show()
        }


        //spinner
        val arrayAdapter2: ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_spinner_dropdown_item,
            programmingNames)

        spinner.adapter = arrayAdapter2


        //onSelected
        spinner.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                Toast.makeText(applicationContext, "You Selected ${parent?.getItemAtPosition(position).toString()} ", Toast.LENGTH_SHORT).show()
                Toast.makeText(applicationContext, "You Selected ${programmingNames[position]} ", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        //autoCompleteTextView
        val arrayAdapter3: ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            programmingNames)

        automcompletetextview.setAdapter(arrayAdapter3)
        automcompletetextview.threshold = 1







    }
}