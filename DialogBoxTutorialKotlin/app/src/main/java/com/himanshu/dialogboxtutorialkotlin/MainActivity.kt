package com.himanshu.dialogboxtutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : AppCompatButton = findViewById(R.id.button)
        val button2 : AppCompatButton = findViewById(R.id.button2)
        val button3 : AppCompatButton = findViewById(R.id.button3)

        button1.setOnClickListener {
            setDialog1()
        }

        button2.setOnClickListener {
            setDialog2()
        }

        button3.setOnClickListener {
            setDialog3()
        }


    }

    fun setDialog1() {
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add her to your Contact List")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Added to Contact", Toast.LENGTH_SHORT).show()
            }
            .setCancelable(false)
            .create() // Don't forget to call create() to create the dialog

        addContactDialog.show()
    }

    fun setDialog2() {
        val options = arrayOf("Option1", "Option2", "Option3")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose One of The Options")
            .setSingleChoiceItems(options,0){ dialog, i ->
                Toast.makeText(this, "You Clicked On ${options[i]} ", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You Accepted Single Choice Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You Declined Single Choice Dialog", Toast.LENGTH_SHORT).show()
            }
            .create() // Don't forget to call create() to create the dialog

        singleChoiceDialog.show()
    }

    fun setDialog3() {
        val options = arrayOf("Option1", "Option2", "Option3")
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose One of The Options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){ dialog, i, isChecked ->
                if(isChecked){
                    Toast.makeText(this, "You clicked On ${options[i]} ", Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this, "You unclicked On ${options[i]} ", Toast.LENGTH_SHORT).show()
                }

            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You Accepted Multi Choice Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You Declined Multi Choice Dialog", Toast.LENGTH_SHORT).show()
            }
            .setCancelable(false)
            .create() // Don't forget to call create() to create the dialog

        multiChoiceDialog.show()
    }

}