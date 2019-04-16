package com.kosmalski.goodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompendiumActivity extends AppCompatActivity {
    private Button buttonAtlas;
    private Button buttonkit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compendium);

        buttonAtlas = (Button) findViewById(R.id.button4);
        buttonAtlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtlasActuvity();
            }
        });


        buttonkit = (Button) findViewById(R.id.button5);
        buttonkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkitActuvity();
            }
        });

    }

    private void openAtlasActuvity() {
        Intent intentAtlas = new Intent(this,AtlasActivity.class);
        startActivity(intentAtlas);
    }

    private void openkitActuvity() {
        Intent intentAtlas = new Intent(this,KitActivity.class);
        startActivity(intentAtlas);
    }



}
