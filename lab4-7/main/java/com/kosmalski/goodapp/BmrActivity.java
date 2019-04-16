package com.kosmalski.goodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class BmrActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    EditText num1, num2,num3 ;
    TextView wynik;
    Button add;
    Switch mySwitch;
    boolean check;

    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);

        Intent intentGetName = getIntent();

        String name = intentGetName.getStringExtra("EXTRA_MESAGE");
        TextView textView = findViewById(R.id.TextViewName);
        textView.setText(name+" Wpisz swoje parametry");
        mySwitch = (Switch) findViewById(R.id.switch1);
        mySwitch.setOnCheckedChangeListener(this);


        num1 = (EditText)findViewById(R.id.numer1);
        num2 = (EditText)findViewById(R.id.numer2);
        num3 = (EditText)findViewById(R.id.numer3);
        wynik = (TextView)findViewById(R.id.wynik);


        add =(Button)findViewById(R.id.buttonAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().length() != 0 && num2.getText().length() != 0 && num3.getText().length() != 0 && check ) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double n3 = Double.parseDouble(num3.getText().toString());
                    double wyn =66 + (13.7 *n1) + (5 * n2) - (6.76 * n3);

                    wynik.setText("Wynik:"+String.valueOf(Math.round(wyn)+"kal"));
                    //  num1.setText(String.valueOf(wyn));
                    //  num2.setText(null);
                    Toast.makeText(getApplicationContext(),"Twoje zapotrzebowanie wynosi wynosi "+wynik.getText()+"kal",Toast.LENGTH_LONG).show();


                }

                else if (num1.getText().length() != 0 && num2.getText().length() != 0 && num3.getText().length() != 0 && !check) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double n3 = Double.parseDouble(num3.getText().toString());
                    double wyn =655 +(9.6 *n1)+(1.8 *n2)-(4.7* n3);

                    wynik.setText("Wynik:"+String.valueOf(Math.round(wyn)+"kal"));
                    //  num1.setText(String.valueOf(wyn));
                    //  num2.setText(null);
                    Toast.makeText(getApplicationContext(),"Twoje zapotrzebowanie wynosi wynosi "+wynik.getText()+"kal",Toast.LENGTH_LONG).show();


                }

            }

        });





    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked) {
            check = true;

        } else if (!isChecked){
            check = false;

        }
    }
}