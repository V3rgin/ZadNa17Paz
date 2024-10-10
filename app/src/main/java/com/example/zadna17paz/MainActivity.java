package com.example.zadna17paz;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {
 /*       private static final String KEY_COUNT = "count";
        private static final String TEXT = "text";
        private static final String CB = "cb";
        private static final String BGC = "bgc";
*/
    private CountViewModel countViewModel;
    private TextView textViewCount;
    private TextView optionSet;
    private TextView test;
    private Button buttonIncrementCounter;
    private EditText userText;
    private CheckBox checkBox;
    private Switch changeBGColor;

    private int count = 0;
    private String textSave;
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
        test = findViewById(R.id.test);

//        countViewModel = new ViewModelProvider(this).get(CountViewModel.class);
        /*if(savedInstanceState != null){
            count = savedInstanceState.getInt(KEY_COUNT);
            textSave = savedInstanceState.getString(TEXT);
            checkBoxSave = savedInstanceState.getBoolean(CB);
            bgColorSave = savedInstanceState.getBoolean(BGC);
        }*/
       updateCountText();
        /*updateCheckBox();
        updateBGColor();
        updateText();*/

        //test.append(count + textSave + checkBoxSave + bgColorSave);
        buttonIncrementCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*count++;*/
                countViewModel.incrementCount();
               updateCountText();
            }
        });
        userText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                textSave = userText.getText().toString();
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
    private void updateCountText(){textViewCount.setText("licznik: " + countViewModel.getCount());}
    private void updateCheckBox(){
        checkBox.setChecked(checkBoxSave);
        if(checkBox.isChecked()){
            optionSet.setVisibility(View.VISIBLE);
        }
        else {
            optionSet.setVisibility(View.GONE);
        }
    }
    private void updateBGColor(){changeBGColor.setChecked(bgColorSave);}
    private void updateText(){userText.setText(textSave);}

  /*  @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, count);
        outState.putBoolean(CB, checkBoxSave);
        outState.putBoolean(BGC, bgColorSave);
        outState.putString(TEXT, textSave);
    }*/
}
