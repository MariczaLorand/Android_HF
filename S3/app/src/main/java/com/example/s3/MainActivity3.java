package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textViewEmail = findViewById(R.id.textViewEmail);

        String email = getIntent().getStringExtra("email");
        textViewEmail.setText(email);
    }
}