package com.lashoppe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_selection extends AppCompatActivity {

    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        button2 = findViewById(R.id.button_2id);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the new activity here
                Intent intent = new Intent(activity_selection.this, loginStudent.class); // Corrected activity class name
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.button_3id);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the new activity here
                Intent intent = new Intent(activity_selection.this, loginFaculty.class); // Corrected activity class name
                startActivity(intent);
            }
        });

        button4 = findViewById(R.id.button_4id);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the new activity here
                Intent intent = new Intent(activity_selection.this, loginAlumni.class); // Corrected activity class name
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Call finish() to close the current activity and return to the previous one
        finish();
    }
}
