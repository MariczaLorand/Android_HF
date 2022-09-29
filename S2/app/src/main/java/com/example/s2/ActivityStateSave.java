package com.example.s2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityStateSave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_save);

        TextView textView = findViewById(R.id.textView2);
        textView.setOnClickListener(view -> {
            textView.setText("new content");
        });
    }
}