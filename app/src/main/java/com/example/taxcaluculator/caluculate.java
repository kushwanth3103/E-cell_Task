package com.example.taxcaluculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class caluculate extends AppCompatActivity {
    int salary;
    int capital_gains;
    int other_resourses;
    double answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caluculate);
        EditText editText1=(EditText)findViewById(R.id.editTextNumber);
        EditText editText2=(EditText)findViewById(R.id.editTextNumber2);
        EditText editText3=(EditText)findViewById(R.id.editTextNumber3);
        Button button=(Button)findViewById(R.id.button2);
        final TextView textView=(TextView)findViewById(R.id.textView);
        try {
            salary=Integer.parseInt(editText1.getText().toString());
        }
        catch (NumberFormatException e)
        {
            salary=0;
        }
        try {
            capital_gains=Integer.parseInt(editText2.getText().toString());
        }
        catch (NumberFormatException e)
        {
            capital_gains=0;
        }
        try {
            other_resourses=Integer.parseInt(editText3.getText().toString());
        }
        catch (NumberFormatException e)
        {
            other_resourses=0;
        }
        answer=0.3*salary+0.2*capital_gains+0.15*other_resourses;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(""+answer);
            }
        });

    }
}