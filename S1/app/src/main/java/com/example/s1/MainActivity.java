package com.example.s1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        EditText textFirstNumber = findViewById(R.id.editTextFirstNumber);
        EditText textSecondNumber = findViewById(R.id.editTextSecondNumber);
        TextView textView = findViewById(R.id.textView2);

        button.setOnClickListener(view -> {
            try {
                int firstNumber = Integer.parseInt(textFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(textSecondNumber.getText().toString());
                multiply(firstNumber, secondNumber, textView);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        button4.setOnClickListener(view -> {
            try {
                int firstNumber = Integer.parseInt(textFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(textSecondNumber.getText().toString());
                divide(firstNumber, secondNumber, textView);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        button2.setOnClickListener(view -> {
            try {
                int firstNumber = Integer.parseInt(textFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(textSecondNumber.getText().toString());
                add(firstNumber, secondNumber, textView);
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        button3.setOnClickListener(view -> {
            try {
                int firstNumber = Integer.parseInt(textFirstNumber.getText().toString());
                int secondNumber = Integer.parseInt(textSecondNumber.getText().toString());
                subtract(firstNumber, secondNumber, textView);
            } catch (Exception e) {
                System.out.println(e);
            }
        });
    }

    public void multiply(int firstNumber, int secondNumber, TextView textView) {
        textView.setText(String.valueOf(firstNumber * secondNumber));
    }

    public void divide(int firstNumber, int secondNumber, TextView textView) {
        textView.setText(String.valueOf(firstNumber / secondNumber));
    }

    public void add(int firstNumber, int secondNumber, TextView textView) {
        textView.setText(String.valueOf(firstNumber + secondNumber));
    }

    public void subtract(int firstNumber, int secondNumber, TextView textView) {
        textView.setText(String.valueOf(firstNumber - secondNumber));
    }
}