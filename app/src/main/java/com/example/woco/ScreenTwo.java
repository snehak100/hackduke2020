package com.example.woco;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;


public class ScreenTwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.enterroomcode);

        DisplayMetrics wh = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(wh);

        double width = wh.widthPixels;
        double height = wh.heightPixels;

        getWindow().setLayout((int) (width*.9), (int) (height*.4));




    }
}
