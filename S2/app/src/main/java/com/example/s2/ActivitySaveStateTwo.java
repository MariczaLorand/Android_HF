package com.example.s2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActivitySaveStateTwo extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        EditText editText = findViewById(R.id.editTextSaved);
        savedInstanceState.putString("savedEditTextContent", editText.getText().toString());

        CheckBox checkBox = findViewById(R.id.checkBox);
        savedInstanceState.putBoolean("savedCheckBoxState", checkBox.isChecked());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_state_two);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String savedEditTextContent = savedInstanceState.getString("savedEditTextContent");
        EditText editText = findViewById(R.id.editTextSaved);
        editText.setText(savedEditTextContent);

        Boolean savedCheckBoxChecked = savedInstanceState.getBoolean("savedCheckBoxState");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(savedCheckBoxChecked);
    }
}