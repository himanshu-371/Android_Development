package com.example.notificationpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationCompat;
import androidx.core.content.res.ResourcesCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String CHANNEL_ID = "Himanshu Channel";
    public static final int NOTIFICATION_ID = 0;
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
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

        Bitmap largeIcon = bitmapDrawable.getBitmap();

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification;


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.send)
                    .setContentText("This is Content Text")
                    .setSubText("Subtext")
                    .setChannelId(CHANNEL_ID)
                    .build();

            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH));

        }else{
            notification = new Notification.Builder(this)
                    .setLargeIcon(largeIcon)
                    .setSmallIcon(R.drawable.send)
                    .setContentText("This is Content Text")
                    .setSubText("Subtext")
                    .setAutoCancel(false)
                    .build();
        }

        nm.notify(NOTIFICATION_ID,notification);
    }


}
