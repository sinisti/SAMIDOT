package com.example.singaboutme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNewA = findViewById(R.id.newActivity);
        buttonNewA.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, imdyingofthirst.class);
            intent.putExtra("message","Witajcie z MainActivity");
            startActivity(intent);
        });
        }
    }