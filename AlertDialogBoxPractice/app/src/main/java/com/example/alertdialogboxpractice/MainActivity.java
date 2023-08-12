package com.example.alertdialogboxpractice;

import static android.content.DialogInterface.BUTTON_POSITIVE;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton singlebutton , doublebutton, triplebutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singlebutton = findViewById(R.id.singlebutton);
        doublebutton = findViewById(R.id.doublebutton);
        triplebutton = findViewById(R.id.triplebutton);

        singlebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog termsAndConditionDialogBox = new AlertDialog.Builder(MainActivity.this).create();

                termsAndConditionDialogBox.setIcon(R.drawable.termsandcondtion);
                termsAndConditionDialogBox.setTitle("Terms and Condition");
                termsAndConditionDialogBox.setMessage("Do you agree to Terms and Conditions?");

                termsAndConditionDialogBox.setButton(DialogInterface.BUTTON_POSITIVE, "Yes, I Agree.", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Thanks For Your Consent.", Toast.LENGTH_SHORT).show();
                    }
                });

                termsAndConditionDialogBox.show();

            }
        });



        doublebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder exitAlertDialog = new AlertDialog.Builder(MainActivity.this);

                exitAlertDialog.setIcon(R.drawable.exit);
                exitAlertDialog.setTitle("Exit?");
                exitAlertDialog.setMessage("Are you Sure? You Want To Exit?");

                exitAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                });

                exitAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Not Exited", Toast.LENGTH_SHORT).show();
                    }
                });

                exitAlertDialog.show();


            }
        });


        triplebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder exitAlertDialog = new AlertDialog.Builder(MainActivity.this);

                exitAlertDialog.setIcon(R.drawable.exit);
                exitAlertDialog.setTitle("Satisfied?");
                exitAlertDialog.setMessage("Are you Satisfied with this App?");

                exitAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Thanks a lot for your Appreciation.", Toast.LENGTH_SHORT).show();
                    }
                });

                exitAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "We are improving ourselves daily.", Toast.LENGTH_SHORT).show();
                    }
                });

                exitAlertDialog.setNeutralButton("Skip for Now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Take Your Time.", Toast.LENGTH_SHORT).show();
                    }
                });

                exitAlertDialog.show();
            }
        });




    }
}