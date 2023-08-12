package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtHeightIn, edtHeightFt, edtWeightKg;
    AppCompatButton CalBMIBtn;
    TextView txtResult;
    LinearLayout llMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding IDs
        edtWeightKg = findViewById(R.id.edtWeightKg);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        CalBMIBtn = findViewById(R.id.CalBMIBtn);
        txtResult = findViewById(R.id.txtResult);
        llMain = findViewById(R.id.llMain);

        //BMI Calculation Button
        CalBMIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting values from user
               int wt = Integer.parseInt(edtWeightKg.getText().toString());
               int ht_F = Integer.parseInt(edtHeightFt.getText().toString());
               int ht_I = Integer.parseInt(edtHeightIn.getText().toString());

               //converting values into required units
               int totalIn = ht_F*12 + ht_I;
               double totalCm = totalIn*2.53;
               double totalM = totalCm/100;

               //BMI Formula
               //unit of BMI is kg/m²
               double BMI = wt/(totalM*totalM);

               //changing BMI into string to display BMI value upto 4 digits in total
               String bmi_string = String.valueOf(BMI);


               //displaying result
               if(BMI>25){
                   txtResult.setText("BMI: "+ bmi_string.substring(0,5) +" You're Overweight!!!");
                   //setting background color
                   llMain.setBackgroundResource((R.color.colorOverWeight));
               } else if (BMI<18) {
                   txtResult.setText("BMI: "+ bmi_string.substring(0,5) +" You're Underweight!!!");
                   //setting background color
                   llMain.setBackgroundResource(R.color.ColorUnderWeight);
               }
               else{
                   txtResult.setText("BMI: "+bmi_string.substring(0,5)+" Congratulations! You're Healthy.");
                   //setting background color
                   llMain.setBackgroundResource(R.color.colorHealthy);
               }
            }
        });
    }
}