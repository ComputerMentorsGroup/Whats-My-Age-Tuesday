package org.computermentors.whatsmyage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        final TextView birthDatePicker = (TextView) findViewById(R.id.ageTextView);
        final Button backButton = (Button) findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMain();
            }
        });
    }

    private void startMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
