package com.example.zadna17paz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private TextView textViewCount;
private Button buttonIncrementCounter;
private EditText userText;
private CheckBox checkBox;
private Switch changeBGColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCount = findViewById(R.id.textViewCount);
        buttonIncrementCounter = findViewById(R.id.buttonIncrement);
        userText = findViewById(R.id.userText);
        checkBox = findViewById(R.id.checkBox);
        changeBGColor = findViewById(R.id.changeBGColor);
    }
}