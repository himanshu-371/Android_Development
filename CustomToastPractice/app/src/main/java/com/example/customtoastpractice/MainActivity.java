package com.example.customtoastpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    AppCompatButton placeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeBtn = findViewById(R.id.placeBtn);


        placeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast t = new Toast(getApplicationContext());

                View v = getLayoutInflater().inflate(R.layout.orderplaced_customtoast_layout, findViewById(R.id.ViewContainer));

                t.setView(v);

                //setting textview message
                TextView txtview;
                txtview = v.findViewById(R.id.txtView);
                txtview.setText("Order Placed!");
                txtview.setTextColor(Color.parseColor("#000000"));

                t.setDuration(Toast.LENGTH_LONG);

                t.show();

            }
        });












    }
}