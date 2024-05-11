package com.example.calculation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class slot23 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot23);

        textView=findViewById(R.id.textView3);

        Intent getData = getIntent();
        //getdata
        double firstNum = getData.getDoubleExtra("first", 0);
        String secondNum = getData.getStringExtra("second");

        sumFunc(firstNum, Double.parseDouble(secondNum));

    }
    //        write a function for the button
    void sumFunc(double firstNum, double secondNum){

        double sum = firstNum + secondNum;
//        display the sum
        textView.setText(String.valueOf(sum));
    }
}