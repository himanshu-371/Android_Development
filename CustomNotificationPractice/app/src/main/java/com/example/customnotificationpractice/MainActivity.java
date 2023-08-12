package com.example.customnotificationpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String CHANNEL_ID = "Himanshu Channel";
    public static final int NOTIFICATION_ID = 100;
    public static final int REQ_CODE = 200;
    public static final String CHANNEL_NAME = "Himanshu Notification";


    AppCompatButton sendNotificationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sendNotificationBtn = findViewById(R.id.sendNotificationBtn);

        sendNotificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNotification();
            }
        });


    }

    public void sendNotification(){

        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.mailsend, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;

        //for intents in Notification
        Intent iNotify = new Intent(getApplicationContext(), MainActivity.class);
        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pi = PendingIntent.getActivity(this, REQ_CODE, iNotify , PendingIntent.FLAG_IMMUTABLE );

        //Big Picture style
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle()
                .bigPicture(((BitmapDrawable) (ResourcesCompat.getDrawable(getResources(), R.drawable.way, null))).getBitmap())
                .bigLargeIcon(largeIcon)
                .setBigContentTitle("This is BigPictureStyle Big Content Title")
                .setSummaryText("This is BigPictureStyle summary text,");

        //Inbox Style
        Notification.InboxStyle inboxStyle = new Notification.InboxStyle()
                .addLine("Line 1")
                .addLine("Line 2")
                .addLine("Line 3")
                .addLine("Line 4")
                .addLine("Line 5")
                .addLine("Line 6")
                .addLine("Line 7")
                .addLine("Line 8")
                .addLine("Line 9")
                .addLine("Line 10")
                .addLine("Line 11")
                .addLine("Line 12")
                .addLine("Line 13")
                .addLine("Line 14")
                .addLine("Line 15")
                .setBigContentTitle("This is InboxStyle Big Content Title")
                .setSummaryText("This is InboxStyle summary text,");


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.send)
                    .setContentText("This is Content Text")
                    .setSubText("Subtext")
                    .setAutoCancel(true)
                    .setContentIntent(pi)
                    .setStyle(bigPictureStyle)
//                    .setStyle(inboxStyle)
                    .setChannelId(CHANNEL_ID)
                    .build();

            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH));

        }else{
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.send)
                    .setAutoCancel(true)
                    .setContentText("This is Content Text")
                    .setStyle(bigPictureStyle)
//                    .setStyle(inboxStyle)
                    .setSubText("Subtext")
                    .setAutoCancel(false)
                    .build();
        }

        nm.notify(NOTIFICATION_ID,notification);
    }

}