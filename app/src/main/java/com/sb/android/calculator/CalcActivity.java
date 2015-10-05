package com.sb.android.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button mButton0 = (Button) findViewById(R.id.button_0);
        Button mButton1 = (Button) findViewById(R.id.button_2);
        Button mButton2 = (Button) findViewById(R.id.button_3);
        Button mButton3 = (Button) findViewById(R.id.button_4);
        Button mButton4 = (Button) findViewById(R.id.button_5);
        Button mButton5 = (Button) findViewById(R.id.button_6);
        Button mButton6 = (Button) findViewById(R.id.button_7);
        Button mButton7 = (Button) findViewById(R.id.button_8);
        Button mButton8 = (Button) findViewById(R.id.button_9);
        Button mButton9 = (Button) findViewById(R.id.button_0);

        Button mAcButton = (Button) findViewById(R.id.button_ac);
        Button mPlusButton1 = (Button) findViewById(R.id.button_plus);
        Button mMinusButton1 = (Button) findViewById(R.id.button_minus);
        Button mMulButton = (Button) findViewById(R.id.button_mul);
        Button mDivButton = (Button) findViewById(R.id.button_div);
        Button mPointButton = (Button) findViewById(R.id.button_point);
        Button mCalcButton = (Button) findViewById(R.id.button_calc);

        mButton0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mButton9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mAcButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMulButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mDivButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mPlusButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mMinusButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mPointButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mCalcButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
