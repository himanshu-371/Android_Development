package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtVar1, edtVar2;
    TextView btnResult;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVar1 = findViewById(R.id.edtVar1);
        edtVar2 = findViewById(R.id.edtVar2);
        btnResult = findViewById(R.id.btnResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.parseInt(edtVar1.getText().toString());
                int var2 = Integer.parseInt(edtVar2.getText().toString());

                int sum = var1 + var2;
                btnResult.setText("Answer: "+sum);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.parseInt(edtVar1.getText().toString());
                int var2 = Integer.parseInt(edtVar2.getText().toString());

                int sub = var1 - var2;
                btnResult.setText("Answer: "+sub);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int var1 = Integer.parseInt(edtVar1.getText().toString());
                int var2 = Integer.parseInt(edtVar2.getText().toString());

                int mul = var1 * var2;
                btnResult.setText("Answer: "+mul);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float var1 = Integer.parseInt(edtVar1.getText().toString());
                float var2 = Integer.parseInt(edtVar2.getText().toString());

                float div = var1 / var2;
                btnResult.setText("Answer "+div);
            }
        });




    }
}