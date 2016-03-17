package com.example.ankita.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
TextView txt1;
    EditText edtData;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtData= (EditText) findViewById(R.id.edtData);
        btnNext= (Button) findViewById(R.id.btnNext);
        txt1= (TextView) findViewById(R.id.txtData);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        txt1.setText(name);



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewAct.class);
                intent.putExtra("name", edtData.getText().toString());
                intent.putExtra("id", 3);

               // startActivity(intent);
                startActivityForResult(intent,11);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String s=data.getStringExtra("newname");
        txt1.setText(s);
    }
}
