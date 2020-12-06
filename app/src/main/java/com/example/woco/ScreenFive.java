package com.example.woco;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class ScreenFive extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.screen5);

        DisplayMetrics who = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(who);

        double width1 = who.widthPixels;
        double height1 = who.heightPixels;

        getWindow().setLayout((int) (width1 * .9), (int) (height1 * .4));
    }
}