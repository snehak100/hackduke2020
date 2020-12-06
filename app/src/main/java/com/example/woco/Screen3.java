package com.example.woco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        Button to6 = findViewById(R.id.button3_4);
        Button to4_1 = findViewById(R.id.button3_2);
        Button to4_2 = findViewById(R.id.button3_3);
        Button to_7 = findViewById(R.id.button3_1);

        to6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(v.getContext(), screen6.class);
                startActivityForResult(go, 0);
            }
        });

        to4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), ScreenFour.class));
            }
        });

        to4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), ScreenFour.class));
            }
        });

        to_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), ScreenSeven.class));
            }
        });
    }
}