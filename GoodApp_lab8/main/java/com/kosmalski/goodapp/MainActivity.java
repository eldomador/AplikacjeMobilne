package com.kosmalski.goodapp;

import android.content.Intent;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button buttonBmi;
    private Button buttonBmr;
    private Button buttonCompedium;
    private Button buttonNote;
    private Button buttonTimer;
    private Button buttonService;



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

        buttonCompedium = (Button) findViewById(R.id.button3);
        buttonCompedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtlasActuvity();
            }
        });

        buttonNote = (Button) findViewById(R.id.button4);
        buttonNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoteActuvity();
            }
        });

        buttonTimer = (Button) findViewById(R.id.button6);
        buttonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimerActuvity();
            }
        });


        buttonService = (Button) findViewById(R.id.button7);
        buttonService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openServiceActuvity();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "GoodApp to aplikacja dla sportowców\nStworzona przez Jakuba Kosmalskiego", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    private void openServiceActuvity() {
        Intent intentService = new Intent(this,MainServiceActivity.class);
        startActivity(intentService);
    }

    private void openTimerActuvity() {
        Intent intentTimer = new Intent(this,TimerActivity.class);
        startActivity(intentTimer);
    }

    private void openNoteActuvity() {
        Intent intentNote = new Intent(this,MealActivity.class);
        startActivity(intentNote);
    }

    private void openAtlasActuvity() {

        Intent intentAtlas = new Intent(this,CompendiumActivity.class);
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
