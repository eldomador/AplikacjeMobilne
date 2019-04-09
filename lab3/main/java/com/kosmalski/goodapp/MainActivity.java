package com.kosmalski.goodapp;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button buttonBmi;
    private Button buttonBmr;
    private Button buttonAtlas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBmi = (Button) findViewById(R.id.button);
        buttonBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBmiActivity();
            }
        });

        buttonBmr = (Button) findViewById(R.id.button2);
        buttonBmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBmrActuvity();
            }
        });

        buttonAtlas = (Button) findViewById(R.id.button3);
        buttonAtlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtlasActuvity();
            }
        });

    }

    private void openAtlasActuvity() {

        Intent intentAtlas = new Intent(this,AtlasActivity.class);
        startActivity(intentAtlas);
    }


    private void openBmiActivity() {
        Intent intentBmi = new Intent(this,BmiActivity.class);
        startActivity(intentBmi);

        EditText editText = findViewById(R.id.editText2);
        String name = editText.getText().toString();

        Intent intentNameBmi = new Intent(this, BmiActivity.class);
        intentNameBmi.putExtra("EXTRA_MESAGE",name);
        startActivity(intentNameBmi);
    }
    private void openBmrActuvity() {
        Intent intentBmr = new Intent(this,BmrActivity.class);
        startActivity(intentBmr);

        EditText editText = findViewById(R.id.editText2);
        String name = editText.getText().toString();

        Intent intentNameBmr = new Intent(this, BmrActivity.class);
        intentNameBmr.putExtra("EXTRA_MESAGE",name);
        startActivity(intentNameBmr);
    }



}
