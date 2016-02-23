package org.computermentors.whatsmyage.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.computermentors.whatsmyage.R;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        Intent intent = getIntent();
        int age = intent.getIntExtra("age", 0);


        final TextView ageTextView = (TextView) findViewById(R.id.ageTextView);
        final Button backButton = (Button) findViewById(R.id.backButton);

        ageTextView.setText("" + age);

        // Returns to the MainActivity
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
