package com.example.singaboutme;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class imdyingofthirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imdyingofthirst);

        //TextView notif = findViewById(R.id.notification);
        //String message = getIntent().getStringExtra("message");
        //notif.setText(message);
        Button buttonoldA = findViewById(R.id.backActivity);
        buttonoldA.setOnClickListener(v -> {finish();});
    }
}