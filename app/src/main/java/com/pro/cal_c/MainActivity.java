package com.pro.cal_c;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_dec,b_c,b_s,b_sub,b_m,b_d,b;
    TextView tV;
    String x="",y,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        b = (Button) findViewById(R.id.b);
        b_c = (Button) findViewById(R.id.b_c);
        b_s = (Button) findViewById(R.id.b_s);
        b_sub = (Button) findViewById(R.id.b_sub);
        b_m = (Button) findViewById(R.id.b_m);
        b_d = (Button) findViewById(R.id.b_d);
        b_dec = (Button) findViewById(R.id.b_dec);

        tV = (TextView) findViewById(R.id.tV);

    }

    public void numClick(View view) {

        x = x + ((Button)view).getText().toString();
        tV.setText(x);
    }

    public void charClick(View view) {

        c = ((Button)view).getText().toString();

        switch (c) {

            case "+" :
                break;

            case "-":
                break;

            case "*":
                break;

            case "/":
                break;


        }
    }

    public void eqClick(View view) {

    }

    public void clClick(View view) {

    }
}

