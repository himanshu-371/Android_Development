package com.example.himanshucalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView input_tv, output_tv;
    MaterialButton btnClear, btnOpenParenthesis, btnCloseParenthesis, btnDot, btnEquals, btnAC;
    MaterialButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    MaterialButton bntAdd, bntSub, bntMul, btnDivide;

    String expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input_tv = findViewById(R.id.input_tv);
        output_tv = findViewById(R.id.output_tv);
        btnClear = findViewById(R.id.btnClear);
        btnOpenParenthesis = findViewById(R.id.btnOpenParenthsis);
        btnCloseParenthesis = findViewById(R.id.btnCloseParenthsis);
        btnDot = findViewById(R.id.btnDot);
        btnEquals = findViewById(R.id.btnEquals);
        btnAC = findViewById(R.id.btnAC);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        bntAdd = findViewById(R.id.btnAdd);
        bntSub = findViewById(R.id.btnSub);
        bntMul = findViewById(R.id.btnMul);
        btnDivide = findViewById(R.id.btnDivide);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = expression + ".";
            }
        });

        btnCloseParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+")");
            }
        });

        btnOpenParenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"(");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                expression = input_tv.getText().toString();

                output_tv.setTextSize(60);
                output_tv.setTextColor(Color.parseColor("#181D31"));
                input_tv.setTextColor(Color.parseColor("#181D31"));

                if(!expression.isEmpty()){
                    expression = expression.substring(0, expression.length() - 1);
                    input_tv.setText(expression);
                    output_tv.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "Nothing to Clear!!!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output_tv.setTextSize(60);
                output_tv.setTextColor(Color.parseColor("#181D31"));
                input_tv.setTextColor(Color.parseColor("#181D31"));


                input_tv.setText("");
                output_tv.setText("0");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"/");
            }
        });

        bntMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"*");
            }
        });

        bntAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"+");
            }
        });

        bntSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression = input_tv.getText().toString();
                input_tv.setText(expression+"-");
            }
        });

        //Calculation
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                expression = input_tv.getText().toString();


                if(!expression.isEmpty()){

                    try{
                        Context rhino = Context.enter();
                        rhino.setOptimizationLevel(-1);

                        String finalResult = "";

                        Scriptable scriptable = rhino.initStandardObjects();

                        finalResult= rhino.evaluateString(scriptable, expression, "Javascript", 1,null).toString();

                        if(finalResult.endsWith(".0")){
                            finalResult = finalResult.replace(".0","");
                        }

                        output_tv.setText(finalResult);

                    }catch(Exception e){

                            Toast.makeText(MainActivity.this, "Please Provide Correct Expression.", Toast.LENGTH_SHORT).show();


                    }

                    if(expression.equals("7011977698")){
                        output_tv.setText("0");
                        Toast.makeText(MainActivity.this, "Developed by Himanshu Chauhan  ❤️", Toast.LENGTH_LONG).show();
                    }

                    if(expression.endsWith("/0")){
                        output_tv.setText("Can't Divide by Zero.");
                        output_tv.setTextSize(35);
                        output_tv.setTextColor(Color.parseColor("#ff0000"));
                        input_tv.setTextColor(Color.parseColor("#ff0000"));
                    }else{
                        output_tv.setTextSize(60);
                        output_tv.setTextColor(Color.parseColor("#181D31"));
                        input_tv.setTextColor(Color.parseColor("#181D31"));
                    }


                }else{
                    Toast.makeText(MainActivity.this, "Nothing to Evaluate!!", Toast.LENGTH_SHORT).show();
                }




            }
        });


    }




}