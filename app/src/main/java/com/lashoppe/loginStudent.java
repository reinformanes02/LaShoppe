package com.lashoppe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginStudent extends AppCompatActivity {

    Button button_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_student);

        button_student = findViewById(R.id.button_student);
        button_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the new activity here
                try {
                    Intent intent = new Intent(loginStudent.this, Menu.class); // Corrected activity class name
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}