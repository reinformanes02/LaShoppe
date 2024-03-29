package com.lashoppe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView; // Added import for ImageView
import android.view.View;
import android.content.Intent;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView textViewSell = findViewById(R.id.textView2);
        textViewSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity here
                Intent intent = new Intent(Menu.this, addproduct.class);
                startActivity(intent);
            }
        });

        ImageView iconCategories = findViewById(R.id.icon_categories); // Corrected variable declaration
        iconCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity here
                Intent intent = new Intent(Menu.this, Categories.class); // Corrected destination activity
                startActivity(intent);
            }
        });
    }
}
