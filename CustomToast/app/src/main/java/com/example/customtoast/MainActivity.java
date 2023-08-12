package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton CustomToastBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToastBtn = findViewById(R.id.CustomToastBtn);

        CustomToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //making object of Toast Class
                Toast toast = new Toast(getApplicationContext());

                View v = getLayoutInflater().inflate(R.layout.custom_toast_layout, findViewById(R.id.ViewContainer));

                //setView method
                toast.setView(v);

                //setting Message
                TextView txtMsg;
                txtMsg = v.findViewById(R.id.txtMsg);
                txtMsg.setText("Message Sent!!!");

                //duration of Toast
                toast.setDuration(Toast.LENGTH_LONG);

                //gravity
                toast.setGravity(Gravity.BOTTOM|Gravity.START,100,50);

                toast.show();

            }
        });


    }
}