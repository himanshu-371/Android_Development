package com.example.alertdialogboxtutorial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//        alertDialog.setTitle("Terms & Conditions");
//        alertDialog.setIcon(R.drawable.baseline_info_24);
//        alertDialog.setMessage("Do you agree these Terms & Conditions?");
//
//        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Yes, I agree", new DialogInterface.OnClickListener(){
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "Agreed", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        alertDialog.show();

        AlertDialog.Builder delDialog = new AlertDialog.Builder(this);
        delDialog.setTitle("Delete?");
        delDialog.setIcon(R.drawable.baseline_delete_forever_24);
        delDialog.setMessage("Are you sure? You want to delete?");


        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //For yes
                Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_SHORT).show();

            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //For no
                Toast.makeText(MainActivity.this, "Not Deleted", Toast.LENGTH_SHORT).show();

            }
        });

        delDialog.show();


    }

    @Override
    public void onBackPressed() {

         AlertDialog.Builder exitDialog = new AlertDialog.Builder(this);
        exitDialog.setTitle("Exit?");
        exitDialog.setIcon(R.drawable.baseline_exit_to_app_24);
        exitDialog.setMessage("Are you sure? You want to Exit?");

        exitDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //For yes
                MainActivity.super.onBackPressed();
                Toast.makeText(MainActivity.this, "Exited", Toast.LENGTH_SHORT).show();

            }
        });

        exitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //For no
                Toast.makeText(MainActivity.this, "Not Exited", Toast.LENGTH_SHORT).show();

            }
        });

        exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Exit Cancelled", Toast.LENGTH_SHORT).show();
            }
        });

        exitDialog.show();

    }

}