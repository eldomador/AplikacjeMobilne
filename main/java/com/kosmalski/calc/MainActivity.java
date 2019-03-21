package com.kosmalski.calc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2 ;
    TextView wynik;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.numer1);
        num2 = (EditText)findViewById(R.id.numer2);

        wynik = (TextView)findViewById(R.id.wynik);

        add =(Button)findViewById(R.id.buttonAdd);
        sub =(Button)findViewById(R.id.buttonSub);
        mul =(Button)findViewById(R.id.buttonMul);
        div =(Button)findViewById(R.id.buttonDiv);

        final Context context = getApplicationContext();
        final CharSequence text = "Wprowadź liczby!";
        final int duration = Toast.LENGTH_SHORT;


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().length() != 0 && num2.getText().length() != 0) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());


                   double wyn = n1 + n2;

                    wynik.setText(String.valueOf(wyn));
                    num1.setText(String.valueOf(wyn));
                    num2.setText(null);


            }

                }

        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().length() != 0 && num2.getText().length() != 0) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double wyn = n1 - n2;

                    wynik.setText(String.valueOf(wyn));
                    num1.setText(String.valueOf(wyn));
                    num2.setText(null);
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().length() != 0 && num2.getText().length() != 0) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double wyn = n1 * n2;

                    wynik.setText(String.valueOf(wyn));
                    num1.setText(String.valueOf(wyn));
                    num2.setText(null);
                }

            }

        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.getText().length() != 0 && num2.getText().length() != 0) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double wyn = n1 / n2;

                    wynik.setText(String.valueOf(wyn));
                    num1.setText(String.valueOf(wyn));
                    num2.setText(null);

                }

            }

        });



    }
}
