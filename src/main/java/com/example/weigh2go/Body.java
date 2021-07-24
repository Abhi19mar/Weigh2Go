package com.example.weigh2go;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Body extends AppCompatActivity {

    float bmi;
    String str1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        final EditText height = findViewById(R.id.height);
        final EditText weight = findViewById(R.id.weight);
        final TextView textView=findViewById(R.id.textview);
        final Button calculateBMI = findViewById(R.id.calc);
        final TextView showresult=findViewById(R.id.showresult);
        calculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = height.getText().toString();
                String weightStr = weight.getText().toString();


                if (heightStr != null && weightStr != null) {
                    float heightValue = Float.parseFloat(heightStr) / 100;
                    float weightValue = Float.parseFloat(weightStr);
                    bmi = weightValue / (heightValue * heightValue);
                    str1 = Float.toString(bmi);


                }

                textView.setText(" BMI = " + str1);
                if (bmi < 18.5) {
                    showresult.setText("CATEGORY = " + "UNDERWEIGHT");

                }
                if (bmi > 18.5 && bmi < 24.9){
                    showresult.setText("CATEGORY = " + "NORMAL");}
                if(bmi >= 25.0 && bmi <= 29.9){
                    showresult.setText("CATEGORY = " + "OVERWEIGHT");}
                if(bmi >= 30.0) {
                    showresult.setText("CATEGORY = " + "OBESE");

                }
                if(bmi>30.0 && bmi<34.9) {
                    showresult.setText("CATEGORY = " + "OBESE CLASS 1");
                }
                if(bmi>35.0 && bmi<39.9) {
                    showresult.setText("CATEGORY = " + "OBESE CLASS 2");
                }
                if(bmi>= 40){
                    showresult.setText("CATEGORY = " + "OBESE CLASS 3");

                }






            }
        });
    }


    }






