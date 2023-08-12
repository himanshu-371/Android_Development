package com.example.bundlepassingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textStudentInfo;
    TextView textRollNoInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Finding IDs
        textStudentInfo = findViewById(R.id.textStudentNameInfo);
        textRollNoInfo = findViewById(R.id.textRollNoInfo);

        //getting intent from Main Activity
        Intent fromMainActivity = getIntent();

        String actionBarName = fromMainActivity.getStringExtra("actionBarName");
        String studentName = fromMainActivity.getStringExtra("studentName");
        int rollNo = fromMainActivity.getIntExtra("rollNo",0);


        //getting intent from Main Activity without setting them into Intent datatype
//        String actionBarName = getIntent().getStringExtra("actionBarName");
//        String studentName = fromMainActivity.getStringExtra("studentName");
//        int rollNo = fromMainActivity.getIntExtra("rollNo",0);

        //displaying Details
        textStudentInfo.setText("Student Name: "+studentName);
        textRollNoInfo.setText("Roll No: "+rollNo);

        //change heading of toolBar
        getSupportActionBar().setTitle(actionBarName);


        //directly setting details in TextView
//        textStudentInfo.setText("StudentName: "+getIntent().getStringExtra("studentName"));
//        textRollNoInfo.setText("Roll No: "+getIntent().getIntExtra("rollNo",0));
//        getSupportActionBar().setTitle(getIntent().getStringExtra("actionBarName"));

    }
}