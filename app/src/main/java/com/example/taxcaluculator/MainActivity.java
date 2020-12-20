package com.example.taxcaluculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_A = (Button) findViewById(R.id.button);
        final EditText editText_name = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText editText_passcode = (EditText) findViewById(R.id.editTextTextPassword);
        button_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((editText_name.getText().toString()).equals("ASDFG1234P")) {
                    i++;
                } else {
                    Toast.makeText(getApplicationContext(),"Entered User Name Is Wrong",Toast.LENGTH_LONG).show();
                    InputMethodManager imm = (InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(editText_passcode.getWindowToken(), 0);
                    i = 0;
                }
                if (i == 1) {
                    if ((editText_passcode.getText().toString()).equals("123")) {
                        i = 0;
                        editText_name.setText("");
                        editText_passcode.setText("");

                        InputMethodManager imm = (InputMethodManager)
                                getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(editText_passcode.getWindowToken(), 0);
                        Intent intent_a = new Intent(getApplicationContext(), caluculate.class);
                        startActivity(intent_a);
                    } else {
                        Toast.makeText(getApplicationContext(),"Entered Password Is Wrong",Toast.LENGTH_LONG).show();
                        InputMethodManager imm = (InputMethodManager)
                                getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(editText_passcode.getWindowToken(), 0);
                    }
                }
            }
        });
    }

}