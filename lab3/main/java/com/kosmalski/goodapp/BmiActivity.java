package com.kosmalski.goodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiActivity extends AppCompatActivity {

    EditText num1, num2 ;
    TextView wynik;
    Button add,exit;

    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bmi);
        Intent intentGetName = getIntent();
        String name = intentGetName.getStringExtra("EXTRA_MESAGE");

        TextView textView = findViewById(R.id.TextViewName);
        textView.setText(name+" wpisz swoje parametry");


        num1 = (EditText)findViewById(R.id.numer1);
        num2 = (EditText)findViewById(R.id.numer2);
        wynik = (TextView)findViewById(R.id.wynik);
        add =(Button)findViewById(R.id.buttonAdd);
        exit =(Button)findViewById(R.id.buttonExit);



        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().length() != 0 && num2.getText().length() != 0) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());


                    double wyn = n1 / ((n2*n2)/10000) ;


                    wynik.setText(String.valueOf(Math.round(wyn)));
                  //  num1.setText(String.valueOf(wyn));
                  //  num2.setText(null);


                    Toast.makeText(getApplicationContext(),"Twoje Bmi wynosi "+wynik.getText(),Toast.LENGTH_LONG).show();


                }

            }

        });

    }
}
