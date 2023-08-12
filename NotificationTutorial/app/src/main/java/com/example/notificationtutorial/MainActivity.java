package com.example.notificationtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String myCHANNEL_ID = "Message Channel";
    private static final int myNOTIFICATION_ID = 27;
    private static final int myREQ_COD = 108;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for largeIcon
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.send,null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
        Bitmap largeIcon = bitmapDrawable.getBitmap();



        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Notification myNotification;

        Intent iNotify = new Intent(getApplicationContext(),MainActivity.class);
        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pi = PendingIntent.getActivity(this, myREQ_COD, iNotify, PendingIntent.FLAG_IMMUTABLE);



        //Big Picture Style
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle()
                .bigPicture(((BitmapDrawable)(ResourcesCompat.getDrawable(getResources(), R.drawable.send,null))).getBitmap())
                .bigLargeIcon(largeIcon)
                .setBigContentTitle("Image sent by Microsoft")
                .setSummaryText("Image Message");

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
                .setBigContentTitle("Full Message")
                .setSummaryText("Message from Microsoft");


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
             myNotification= new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.mail_send)
                    .setContentText("Congratulations!!! Himanshu Chauhan for 27LPA")
                    .setSubText("New Message")
                    .setContentIntent(pi)
                    .setAutoCancel(false)  // or .setOngoing(true)
//                    .setStyle(bigPictureStyle)
                     .setStyle(inboxStyle)
                    .setChannelId(myCHANNEL_ID)
                    .build();

             nm.createNotificationChannel(new NotificationChannel(myCHANNEL_ID, "New Message Channel", NotificationManager.IMPORTANCE_HIGH));

        }

        else{
             myNotification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.mail_send)
                    .setContentText("New Message")
                    .setContentIntent(pi)
                    .setAutoCancel(false)
//                    .setStyle(bigPictureStyle)
                    .setStyle(inboxStyle)
                    .setSubText("Congratulations!!! Himanshu Chauhan for 27LPA")
                    .build();
        }

        nm.notify(myNOTIFICATION_ID, myNotification);



    }
}