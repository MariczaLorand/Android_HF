package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        String email = "a";
        String  email = getString(R.string.email);
        String password = "1";

        TextInputEditText userInputMail = findViewById(R.id.userInputMail);
        TextInputEditText userInputPassword = findViewById(R.id.userInputPassword);
        Button button = findViewById(R.id.buttonSignIn);

        button.setOnClickListener(view -> {

            if (email.equals(userInputMail.getText().toString()) && password.equals(userInputPassword.getText().toString())) {
//                Log.d("customFilter", "if statement scope");
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("email", userInputMail.getText().toString());
                startActivity(intent);
            } else {
//                Log.d("customFilter", "else statement scope");
                Toast.makeText(
                        getApplicationContext(),
                        "Email or password incorrect.",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

    }
}