package com.example.appmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtDevName, edtAppName;
    Button btnDev;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtDevName = findViewById(R.id.edtDevName);
        edtAppName = findViewById(R.id.edtAppName);
        btnDev = findViewById(R.id.btnDev);

        btnDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ibtnDev = new Intent(MainActivity.this, SecondActivity.class);

                String YourName = edtDevName.getText().toString();
                String AppName = edtAppName.getText().toString();

                ibtnDev.putExtra("keyYourName", YourName);
                ibtnDev.putExtra("keyAppName", AppName);

                startActivity(ibtnDev);

            }
        });


    }
}