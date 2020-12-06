package com.example.woco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// for opening screen 5 from screen 4
        Button m1 = (Button) findViewById(R.id.button3_3);
        Button m2 = (Button) findViewById(R.id.button3_4);
        Button m3 = (Button) findViewById(R.id.button4_2);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                startActivity(new Intent(ScreenFour.this, ScreenFive.class));
            }

        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(ScreenFour.this, ScreenFive.class));
            }

        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                startActivity(new Intent(ScreenFour.this, ScreenFive.class));
            }

        });

    }
}
