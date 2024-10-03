package com.example.zadna17paz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_COUNT = "count";
    private static final String TEXT = "text";
    private static final String CB = "cb";

    private TextView textViewCount;
    private TextView optionSet;
    private Button buttonIncrementCounter;
    private EditText userText;
    private CheckBox checkBox;
    private Switch changeBGColor;

    private int count = 0;
    private String text;
    private boolean checkBoxSave;
    private boolean bgColorSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.textViewCount);
        buttonIncrementCounter = findViewById(R.id.buttonIncrement);
        userText = findViewById(R.id.userText);
        checkBox = findViewById(R.id.checkBox);
        changeBGColor = findViewById(R.id.changeBGColor);
        optionSet = findViewById(R.id.optionSet);

        if(savedInstanceState != null){
            count = savedInstanceState.getInt(KEY_COUNT);
            text = savedInstanceState.getString(TEXT);
            checkBoxSave = savedInstanceState.getBoolean(CB);
        }
        updateCountText();
        updateUserText();
        updateCheckBox();

        buttonIncrementCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                updateCountText();
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSave = checkBox.isChecked();
                if(checkBoxSave){
                    optionSet.setVisibility(View.VISIBLE);
                }else {
                    optionSet.setVisibility(View.GONE);
                }
            }
        });

        changeBGColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bgColorSave = changeBGColor.isChecked();
                if(bgColorSave){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });
    }
    private void updateCountText(){textViewCount.setText("licznik: " + count);}
    private void updateUserText(){userText.getText();}
    private void updateCheckBox(){checkBox.setChecked(checkBoxSave);}
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
        outState.putString(TEXT, text);
        outState.putBoolean(CB, checkBoxSave);
    }

}