package com.example.implicitintenttutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatButton callBtn, msgBtn, emailBtn, shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callBtn = findViewById(R.id.callBtn);
        msgBtn = findViewById(R.id.msgBtn);
        emailBtn = findViewById(R.id.emailBtn);
        shareBtn = findViewById(R.id.shareBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iCall = new Intent(Intent.ACTION_DIAL);
//                OR
//                iCall.setAction(Intent.ACTION_DIAL);

                iCall.setData(Uri.parse("tel: +917011977698"));
                startActivity(iCall);

            }
        });


        msgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iMsg  = new Intent(Intent.ACTION_SENDTO);
//                OR
//                iEmail.setAction(Intent.ACTION_SENDTO);

                iMsg.setData(Uri.parse("smsto:"+Uri.encode("+917011977698")));
                iMsg.putExtra("sms_body","Your development is gorgeous!!!");
                startActivity(iMsg);

            }
        });


       emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iEmail = new Intent(Intent.ACTION_SEND);
//                OR
//                iEmail.setAction(Intent.ACTION_SEND);

                iEmail.setType("message/rfc822");
                iEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"201071.cse1@gitmgurgaon.com"});
                iEmail.putExtra(Intent.EXTRA_SUBJECT, "Job Offer Letter");
                iEmail.putExtra(Intent.EXTRA_TEXT, "Congratulations, You got 27LPA!!!");
                startActivity(Intent.createChooser(iEmail, "You want to Email via:"));

            }
       });

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iShare = new Intent(Intent.ACTION_SEND);
//                OR
//                iShare.setAction(Intent.ACTION_SEND);

                iShare.setType("text/plain");
                iShare.putExtra(Intent.EXTRA_TEXT, "I learned this Share through this video, https://www.youtube.com/watch?v=r-JNSsrIBds&list=PLjVLYmrlmjGdDps6HAwOOVoAtBPAgIOXL&index=69");
                startActivity(Intent.createChooser(iShare,"You want to share via: "));

            }
        });








    }
}