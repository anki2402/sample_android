package com.example.ankita.calciapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String str="";
    char op='q';
    int  num, numtTemp;
    EditText showResult;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bPtr, bEql;
boolean add,sub,mul,div;

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
        showResult= (EditText) findViewById(R.id.edt1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // b1.setText(showResult.getText()+"1");
                showResult.setText("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //b2.setText(showResult.getText() + "2");
                showResult.setText("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  b3.setText(showResult.getText() + "3");
                showResult.setText("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showResult.setText("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //     b7.setText(showResult.getText() + "7");
                showResult.setText("7");

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText("8");
            }
        });

        b9.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText("9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText("0");
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText( "+");
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText( "-");
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText( "*");
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText( "/");
            }
        });
        bPtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult.setText( ".");
            }
        });
        bEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num=Integer.parseInt(showResult.getText().toString());}

            private void insert(int j){
            str=str+Integer.toString(j);
            num=Integer.valueOf(str);
            showResult.setText(str);
            }
            private void perform(){
            str=" ";
                numtTemp=num;
            }
            private void calculate(){
                if(op=='+')
                    num=numtTemp+num;
                else if(op=='-')
                    num=numtTemp-num;
                else if(op=='*')
                    num=numtTemp*num;
                else if(op=='/')
                    num=numtTemp/num;
                showResult.setText(""+num);


        }});}}