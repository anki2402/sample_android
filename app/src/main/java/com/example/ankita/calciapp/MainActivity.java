package com.example.ankita.calciapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String str = "";
    Character op = 'q';
    int i, num, numtTemp;
    EditText showResult;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bPtr, bEql;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        b0 = (Button) findViewById(R.id.btn0);
        bAdd = (Button) findViewById(R.id.btnAdd);
        bSub = (Button) findViewById(R.id.btnSub);
        bMul = (Button) findViewById(R.id.btnMul);
        bDiv = (Button) findViewById(R.id.btnDiv);
        bPtr = (Button) findViewById(R.id.btnPtr);
        bEql= (Button) findViewById(R.id.btnEql);
b1.setOnClickListener(new.View.OnClickListener);
        
    }
}