package com.example.zadna17paz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_COUNT = "count";
    private TextView textViewCount;
    private Button buttonIncrementCounter;
    private EditText userText;
    private CheckBox checkBox;
    private Switch changeBGColor;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.textViewCount);
        buttonIncrementCounter = findViewById(R.id.buttonIncrement);
        userText = findViewById(R.id.userText);
        checkBox = findViewById(R.id.checkBox);
        changeBGColor = findViewById(R.id.changeBGColor);

        if(savedInstanceState != null){
            count = savedInstanceState.getInt(KEY_COUNT);
        }
        updateCountText();

        buttonIncrementCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                updateCountText();
            }
        });

    }
    private void updateCountText(){
        textViewCount.setText("licznik: " + count);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);

    }
    private void bgColor(){
        if(changeBGColor.isActivated()){

        }
    }

}