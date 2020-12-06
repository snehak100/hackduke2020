package com.example.woco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;


public class ScreenTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button goBtn = findViewById(R.id.button2_1);

        setContentView(R.layout.enterroomcode);

        DisplayMetrics wh = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(wh);

        double width = wh.widthPixels;
        double height = wh.heightPixels;

        getWindow().setLayout((int) (width*.9), (int) (height*.4));

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(v.getContext(), Screen3.class);
                startActivityForResult(go, 0);
            }
        });
    }
}
