package com.unidrop.app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView otpCard;
    CardView deliveryCard;
    CardView historyCard;
    CardView notificationCard;
    CardView profileCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        otpCard = findViewById(R.id.cardGenerateOtp);
        deliveryCard = findViewById(R.id.deliveryCard);
        historyCard = findViewById(R.id.cardHistory);
        notificationCard = findViewById(R.id.cardNotifications);
        profileCard = findViewById(R.id.cardProfile);

        otpCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, GenerateOtpActivity.class)));

        deliveryCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, DeliveryModeActivity.class)));

        historyCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, DeliveryHistoryActivity.class)));

        notificationCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, NotificationsActivity.class)));

        profileCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
    }
}