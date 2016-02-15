package org.computermentors.whatsmyage.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import org.computermentors.whatsmyage.BackEnd.Calculate;
import org.computermentors.whatsmyage.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Calculate mCalculate = new Calculate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatePicker birthDatePicker = (DatePicker) findViewById(R.id.birthDatePicker);
        final Button findAgeButton = (Button) findViewById(R.id.findAgeButton);

        // Activates the findAGeButton to retrieve the users age...
        findAgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //... first it converts the DatePicker into a Date variable...
                Date date = mCalculate.getDate(birthDatePicker);

                //... then it Calculates the age to an int in years...
                int year = mCalculate.getAge(date);

                //... then it starts the AgeActivity...
                startAgeActivity(year);
            }
        });
    }

    private void startAgeActivity(int year){
        Intent intent = new Intent(this, AgeActivity.class);
        startActivity(intent);
    }
}
