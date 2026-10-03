package com.unidrop.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OTPValidationActivity extends AppCompatActivity {

    private EditText otp1, otp2, otp3, otp4, otp5, otp6;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpvalidation);

        otp1 = findViewById(R.id.otp1);
        otp2 = findViewById(R.id.otp2);
        otp3 = findViewById(R.id.otp3);
        otp4 = findViewById(R.id.otp4);
        otp5 = findViewById(R.id.otp5);
        otp6 = findViewById(R.id.otp6);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(view -> {

            String otp =
                    otp1.getText().toString() +
                            otp2.getText().toString() +
                            otp3.getText().toString() +
                            otp4.getText().toString() +
                            otp5.getText().toString() +
                            otp6.getText().toString();

            if ("583214".equals(otp)) {
                Toast.makeText(
                        OTPValidationActivity.this,
                        "OTP Verified Successfully",
                        Toast.LENGTH_SHORT
                ).show();
            } else {
                Toast.makeText(
                        OTPValidationActivity.this,
                        "Invalid OTP",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}