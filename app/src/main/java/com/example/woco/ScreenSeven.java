package com.example.woco;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenSeven extends AppCompatActivity {
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen7);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_LONG).show();
                }

            }
        });
        CheckBox checkBox1;

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_LONG).show();
                }

            }
        });
        CheckBox checkBox2;

        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}
