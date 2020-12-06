package com.example.woco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ScreenTen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen10);
        final Random myRandom = new Random();

        //this is for the random code generation for the room- screen 10
        Button g = (Button) findViewById(R.id.generate);
        final TextView textGenerateNumber = (TextView) findViewById(R.id.generatenumber);

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(100000)));
            }

        });
    }
}
