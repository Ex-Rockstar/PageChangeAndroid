package com.example.fromoneacttoanother;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class first_activity extends AppCompatActivity {

    EditText sendText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);

        sendText = findViewById(R.id.send_text);
        sendButton = findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = sendText.getText().toString();
                Intent intent = new Intent(first_activity.this, Second_activity.class);
                intent.putExtra("message_key", message);
                startActivity(intent);
            }
        });
    }
}
