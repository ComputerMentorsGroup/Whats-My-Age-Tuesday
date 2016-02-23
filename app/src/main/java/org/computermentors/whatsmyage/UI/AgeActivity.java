package org.computermentors.whatsmyage.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
<<<<<<< HEAD:app/src/main/java/org/computermentors/whatsmyage/AgeActivity.java
=======

import org.computermentors.whatsmyage.R;
>>>>>>> master:app/src/main/java/org/computermentors/whatsmyage/UI/AgeActivity.java

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

<<<<<<< HEAD:app/src/main/java/org/computermentors/whatsmyage/AgeActivity.java
        final TextView birthDatePicker = (TextView) findViewById(R.id.ageTextView);
=======
        final TextView ageTextView = (TextView) findViewById(R.id.ageTextView);
>>>>>>> master:app/src/main/java/org/computermentors/whatsmyage/UI/AgeActivity.java
        final Button backButton = (Button) findViewById(R.id.backButton);

        ageTextView.setText("Hello!");

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
