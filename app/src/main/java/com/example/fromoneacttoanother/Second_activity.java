package com.example.fromoneacttoanother;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Second_activity extends AppCompatActivity {

    TextView receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        receivedText = findViewById(R.id.received_text);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message_key");
        receivedText.setText(message);
    }
}
