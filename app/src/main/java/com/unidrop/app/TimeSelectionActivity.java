package com.unidrop.app;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class TimeSelectionActivity extends AppCompatActivity {

    EditText etStartTime, etEndTime;
    Button btnSaveTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_selection);

        etStartTime = findViewById(R.id.etStartTime);
        etEndTime = findViewById(R.id.etEndTime);
        btnSaveTime = findViewById(R.id.btnSaveTime);

        etStartTime.setOnClickListener(v -> showTimePicker(etStartTime));

        etEndTime.setOnClickListener(v -> showTimePicker(etEndTime));

        btnSaveTime.setOnClickListener(v ->
                Toast.makeText(
                        TimeSelectionActivity.this,
                        "Delivery Time Saved",
                        Toast.LENGTH_SHORT
                ).show());
    }

    private void showTimePicker(EditText editText) {

        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog dialog =
                new TimePickerDialog(
                        this,
                        (view, hourOfDay, minute1) -> {

                            String ampm =
                                    hourOfDay >= 12 ? "PM" : "AM";

                            int hour12 =
                                    hourOfDay % 12;

                            if (hour12 == 0)
                                hour12 = 12;

                            String time =
                                    String.format(
                                            "%02d:%02d %s",
                                            hour12,
                                            minute1,
                                            ampm
                                    );

                            editText.setText(time);
                        },
                        hour,
                        minute,
                        false
                );

        dialog.show();
    }
}