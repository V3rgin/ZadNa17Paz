package com.example.zadna17paz;
import android.util.Log;
import android.widget.EditText;
import android.util.Log;

import androidx.lifecycle.ViewModel;
public class CountViewModel extends ViewModel {

//        private int count = 0; // Zmienna do przechowywania wartości licznika
//        private boolean checkbox;
//        private boolean background;
//        private EditText userText;
//        private String text = userText.getText().toString();

        public int getCount() {
                Log.i("CountViewModel", "test");
                return 5; // Zwróć aktualną wartość licznika
        }
        public void incrementCount() {
//            count++; // Zwiększ wartość licznika
        }
        /*public void setCheckbox(){

        }
        public boolean isCheckbox() {
            return checkbox;
        }
        public String getText(){
            return text;
        }
        public void setText(){

        }
        public boolean isBackground() {
            return background;
        }
        public void setBackground(){

        }*/

}
