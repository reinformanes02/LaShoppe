package com.lashoppe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;






public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView textViewSell = findViewById(R.id.textView2);
        textViewSell.setOnClickListener(new View.OnClickListener()

                val iconCategories = findViewById < ImageView > (R.id.icon_categories)
                        iconCategories.setOnClickListener {
            @Override
            public void onClick(View v) {
                // Start the new activity here
                Intent intent = new Intent(Menu.this, addproduct.class);
                startActivity(intent);
            }
        });


            // Replace "DestinationActivity" with the name of your destination activity
            val intent = Intent(this, DestinationActivity:: class.java)
            startActivity(intent)
        }
    }


    }
}