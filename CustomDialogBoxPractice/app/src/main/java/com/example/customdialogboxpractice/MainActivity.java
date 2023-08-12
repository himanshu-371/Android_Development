package com.example.customdialogboxpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button okayBtn;
    AppCompatButton orderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderBtn = findViewById(R.id.orderBtn);

        //custom DialogBox
        Dialog orderPlacedCustomDialog = new Dialog(MainActivity.this);
        orderPlacedCustomDialog.setContentView(R.layout.orderplaced_custom_dialog_box);
        orderPlacedCustomDialog.setCancelable(false);


        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderPlacedCustomDialog.show();
            }
        });


        //Okay Btn
        okayBtn = orderPlacedCustomDialog.findViewById(R.id.OkayBtn);
        okayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderPlacedCustomDialog.dismiss();
            }
        });



    }
}