package pl.kosmalski.testservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonBmi;
    
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
    }

    private void openBmiActivity() {
        Intent intentBmi = new Intent(this,MainServiceActivity.class);
        startActivity(intentBmi);

    }
}
