package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText edtName;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding IDs
        edtName = findViewById(R.id.edtName);
        btnSend = findViewById(R.id.btnSend);

        //Send Button
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting data into username variable
                String username = edtName.getText().toString();

                //Passing Intent
                Intent  intent = new Intent(MainActivity.this , SecondActivity.class);

                //Passing Bundle
                intent.putExtra("key_username", username);

                startActivity(intent);

            }
        });

    }
}