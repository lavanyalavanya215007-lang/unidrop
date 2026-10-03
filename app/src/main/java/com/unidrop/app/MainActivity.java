package com.unidrop.app;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView otpCard;
    CardView deliveryCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        // Generate OTP Card
        otpCard = findViewById(R.id.cardGenerateOtp);

        otpCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GenerateOtpActivity.class);
            startActivity(intent);
        });

        // Delivery Mode Card
        deliveryCard = findViewById(R.id.deliveryCard);

        deliveryCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DeliveryModeActivity.class);
            startActivity(intent);
        });
    }
}