package com.example.woco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class screen9 extends AppCompatActivity {

    Button upTenMin, downTenMin, upMin, downMin, upTenSec, downTenSec, upSec, downSec, setTimeBtn;
    TextView tenMinDig, minDig, tenSecDig, secDig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen9);

        upTenMin = (Button)findViewById(R.id.button3);
        downTenMin = (Button)findViewById(R.id.button10);
        upMin = (Button)findViewById(R.id.button6);
        downMin = (Button)findViewById(R.id.button9);
        upTenSec = (Button)findViewById(R.id.button5);
        downTenSec = (Button)findViewById(R.id.button8);
        upSec = (Button)findViewById(R.id.button4);
        downSec = (Button)findViewById(R.id.button7);
        setTimeBtn = (Button)findViewById(R.id.button11);
        tenMinDig = (TextView)findViewById(R.id.textView13);
        minDig = (TextView)findViewById(R.id.textView18);
        tenSecDig = (TextView)findViewById(R.id.textView19);
        secDig = (TextView)findViewById(R.id.textView20);

        upTenMin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tenMinDig.setText(timeChange(Integer.parseInt(tenMinDig.getText().toString()), true));
            }
        });
        downTenMin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tenMinDig.setText(timeChange(Integer.parseInt(tenMinDig.getText().toString()), false));
            }
        });
        upMin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                minDig.setText(timeChange(Integer.parseInt(minDig.getText().toString()), true));
            }
        });
        downMin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                minDig.setText(timeChange(Integer.parseInt(minDig.getText().toString()), false));
            }
        });
        upTenSec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tenSecDig.setText(timeChange(Integer.parseInt(tenSecDig.getText().toString()), true));
            }
        });
        downTenSec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                tenSecDig.setText(timeChange(Integer.parseInt(tenSecDig.getText().toString()), false));
            }
        });
        upSec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                secDig.setText(timeChange(Integer.parseInt(secDig.getText().toString()), true));
            }
        });
        downSec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                secDig.setText(timeChange(Integer.parseInt(secDig.getText().toString()), false));
            }
        });
        setTimeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int ms = (Integer.parseInt(tenMinDig.getText().toString()) * 600000)
                        + (Integer.parseInt(minDig.getText().toString()) * 60000)
                        + (Integer.parseInt(tenSecDig.getText().toString()) * 10000)
                        + (Integer.parseInt(secDig.getText().toString()) * 1000);
                new CountDownTimer(ms, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int tenMin = (int)millisUntilFinished % 600000;
                        millisUntilFinished -= tenMin * 600000;
                        int min = (int)millisUntilFinished % 60000;
                        millisUntilFinished -= min * 60000;
                        int tenSec = (int)millisUntilFinished % 10000;
                        millisUntilFinished -= tenSec * 10000;
                        int sec = (int)millisUntilFinished / 1000;
                        String timeRemaining = String.valueOf(tenMin) + String.valueOf(min)
                                + ":" + String.valueOf(tenSec) + String.valueOf(sec);
                        /*
                        * update text on screens 3,4,7
                        * go back to previous screen
                         */
                    }
                    @Override
                    public void onFinish() {
                        setContentView(R.layout.activity_screen13);
                        /* more? */
                    }
                }.start();
            }
        });
    }

    private String timeChange(int currNum, boolean up){
        String ret = "";
        switch (currNum) {
            case 0: if (up) {ret = "1";} else {ret="9";}
                break;
            case 1: if (up) {ret = "2";} else {ret="0";}
                break;
            case 2: if (up) {ret = "3";} else {ret="1";}
                break;
            case 3: if (up) {ret="4";} else {ret="2";}
                break;
            case 4: if (up) {ret="5";} else {ret="3";}
                break;
            case 5: if (up) {ret="6";} else {ret="4";}
                break;
            case 6: if (up) {ret="7";} else {ret="5";}
                break;
            case 7: if (up) {ret="8";} else {ret="6";}
                break;
            case 8: if (up) {ret="9";} else {ret="7";}
                break;
            case 9: if (up) {ret="0";} else {ret="8";}
                break;
        }
        return ret;
    }
}