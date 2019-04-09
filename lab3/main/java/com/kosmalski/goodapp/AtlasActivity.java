package com.kosmalski.goodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AtlasActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String text;
    RadioGroup radioGroup;
    int bodyPartInt;
    Long levelInt;
    int inHomeInt;
    Button buttonShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atlas);

        Spinner spinner =findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.level, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);







        buttonShow = (Button)findViewById(R.id.buttonShow);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            ImageView img= (ImageView) findViewById(R.id.imageView);
            TextView textView = findViewById(R.id.textView3);
            @Override
            public void onClick(View v) {
                if (levelInt == 0 && bodyPartInt == 1 && inHomeInt ==0 ) {
                    img.setImageResource(R.drawable.b1);
                    textView.setText(R.string.lev0Part1Inhome0);
                }

                else if (levelInt == 0 && bodyPartInt == 2 && inHomeInt ==0 ) {
                    img.setImageResource(R.drawable.k1);
                    textView.setText(R.string.lev0Part2Inhome0);
                }

                else if (levelInt == 0 && bodyPartInt == 3 && inHomeInt ==0 ) {
                    img.setImageResource(R.drawable.n1);
                    textView.setText(R.string.lev0Part3Inhome0);
                }

                else if (levelInt == 0 && bodyPartInt == 1 && inHomeInt ==1 ) {
                    img.setImageResource(R.drawable.b2);
                    textView.setText(R.string.lev0Part1Inhome1);
                }

                else if (levelInt == 0 && bodyPartInt == 2 && inHomeInt ==1 ) {
                    img.setImageResource(R.drawable.k2);
                    textView.setText(R.string.lev0Part2Inhome1);
                }

                else if (levelInt == 0 && bodyPartInt == 3 && inHomeInt ==1 ) {
                    img.setImageResource(R.drawable.n2);
                    textView.setText(R.string.lev0Part3Inhome1);
                }

                else if (levelInt == 1 && bodyPartInt == 1 && inHomeInt ==0 ) {
                    img.setImageResource(R.drawable.b3);
                    textView.setText(R.string.lev1Part1Inhome0);
                }

                else if (levelInt == 1 && bodyPartInt == 2 && inHomeInt ==0 ) {
                    img.setImageResource(R.drawable.k3);
                    textView.setText(R.string.lev1Part2Inhome0);
                }

                else if (levelInt == 1 && bodyPartInt == 3 && inHomeInt ==0 ) {
                    img.setImageResource(R.drawable.n1);
                    textView.setText(R.string.lev0Part3Inhome0);
                }

                else if (levelInt == 1 && bodyPartInt == 1 && inHomeInt ==1 ) {
                    img.setImageResource(R.drawable.b2);
                    textView.setText(R.string.lev0Part1Inhome1);
                }

                else if (levelInt == 1 && bodyPartInt == 2 && inHomeInt ==1 ) {
                    img.setImageResource(R.drawable.k2);
                    textView.setText(R.string.lev0Part2Inhome1);
                }

                else if (levelInt == 1 && bodyPartInt == 3 && inHomeInt ==1 ) {
                    img.setImageResource(R.drawable.n2);
                    textView.setText(R.string.lev0Part3Inhome1);
                }

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        levelInt=id;

        //text = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),text+String.valueOf(bodyPartInt)+String.valueOf(id)+String.valueOf(inHomeInt),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case  R.id.radioArms:
                if (checked)
                    bodyPartInt=1;

                break;




            case R.id.radioChest:
                if (checked)
                    bodyPartInt=2;
                   // Toast.makeText(getApplicationContext(),"Klata"+String.valueOf(bodyPartInt)+String.valueOf(levelInt),Toast.LENGTH_LONG).show();
                break;

            case R.id.radioLegs:
                if (checked)
                    bodyPartInt=3;
                   // Toast.makeText(getApplicationContext(),"Nogi"+String.valueOf(bodyPartInt)+String.valueOf(levelInt),Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked)
                    inHomeInt=1;

            else
                    inHomeInt=0;

        }
    }

//    ImageView img= (ImageView) findViewById(R.id.imageView);
//                img.setImageResource(R.drawable.ic_launcher_background);
//    TextView textView = findViewById(R.id.textView3);
//                textView.setText(" wpisz swoje parametry");

}
