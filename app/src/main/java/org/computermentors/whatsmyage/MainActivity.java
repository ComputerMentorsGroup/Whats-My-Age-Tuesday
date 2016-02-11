package org.computermentors.whatsmyage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    private Calculate mCalculate = new Caclulate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatePicker birthDatePicker = (DatePicker) findViewById(R.id.birthDatePicker);
        final Button findAgeButton = (Button) findViewById(R.id.findAgeButton);

        findAgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAgeActivity();
            }
        });
    }

    private void startAgeActivity(){
        Intent intent = new Intent(this, AgeActivity.class);
        startActivity(intent);
    }
}
