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
import android.widget.TextView;

import com.sb.android.calculator.utility.CalcLogic;

/**
 * @Author Namudak Oct.6, 2015
 * Simple calculator for signed digit.
 */
public class CalcActivity extends AppCompatActivity implements View.OnClickListener{
    
    // Component referenced during execution
    private TextView mDisplayField;                     // display result / input.

    // Variables representing state of the calculator
    private boolean   mStartNumber = true;              // true: num key next
    private String    mPreviousOp  = "=";               // previous operation
    private final CalcLogic mLogic = new CalcLogic();   // The internal calculator.

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


        // TextView for displaying result
        mDisplayField= (TextView) findViewById(R.id.displayTextView);

        SetListener();

        AllClear();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_0:
                NumericInput("0");
                break;
            case R.id.button_1:
                NumericInput("1");
                break;
            case R.id.button_2:
                NumericInput("2");
                break;
            case R.id.button_3:
                NumericInput("3");
                break;
            case R.id.button_4:
                NumericInput("4");
                break;
            case R.id.button_5:
                NumericInput("5");
                break;
            case R.id.button_6:
                NumericInput("6");
                break;
            case R.id.button_7:
                NumericInput("7");
                break;
            case R.id.button_8:
                NumericInput("8");
                break;
            case R.id.button_9:
                NumericInput("9");
                break;
            case R.id.button_point:
                NumericInput(".");
                break;
            case R.id.button_back:
                BackClear();
                break;
            case R.id.button_ac:
                AllClear();
                break;
            case R.id.button_plus:
                OperatorInput("+");
                break;
            case R.id.button_minus:
                OperatorInput("-");
                break;
            case R.id.button_mul:
                OperatorInput("*");
                break;
            case R.id.button_div:
                OperatorInput("/");
                break;
            case R.id.button_calc:
                OperatorInput("=");
                break;

        }
    }

    /**
     * When pressed numeric or '.'
     */
    private void NumericInput(String digit) {

        if (mStartNumber) {
            // This is the first digit, clear field and set
            mDisplayField.setText(digit);
            mStartNumber = false;
        } else {
            // Add this digit to the end of the display field
            mDisplayField.setText(mDisplayField.getText() + digit);
        }
    }

    /**
     * When pressed operators as '+' '-' '*' '/' '='
     */
    private void OperatorInput(String op) {
        // The calculator is always in one of two states.
        // 1. A number must be entered -- an operator is wrong.
        // 2. An operator must be entered.
        if (mStartNumber) { // Error: needed number, not operator
            // In this state we're expecting a number, but got an operator.
            AllClear();
            mDisplayField.setText("Error- No operator");
        } else {
            // We're expecting an operator.
            mStartNumber = true;  // Next thing must be a number
            try {
                // Get value from display field, convert, do prev op
                // If this is the first op, mPreviousOp will be =.
                String displayText = mDisplayField.getText().toString();

                switch (mPreviousOp) {
                    case "=":
                        mLogic.setTotal(displayText);
                        break;
                    case "+":
                        mLogic.add(displayText);
                        break;
                    case "-":
                        mLogic.subtract(displayText);
                        break;
                    case "*":
                        mLogic.multiply(displayText);
                        break;
                    case "/":
                        mLogic.divide(displayText);
                        break;
                }
                // Omit '0.' when entering operators
                if(!displayText.contains(".")) {
                    displayText= mLogic.getTotalString().replace(".0", "");
                }
                mDisplayField.setText("" + displayText);

            } catch (NumberFormatException ex) {
                AllClear();
                mDisplayField.setText("Error");
            }

            // set mPreviousOp for the next operator.
            mPreviousOp = op;
        }

    }
    /**
     * When pressed backbutton
     */
    private void BackClear() {
        String str= mDisplayField.getText().toString();

        if(str.length()> 0) {
            mDisplayField.setText(str.substring(0, str.length()- 1));
            mStartNumber= false;
            mPreviousOp  = "=";
        }
    }

    /**
     * When pressed 'AC' operator
     */
    private void AllClear() {
        // Expecting number, not op.
        mStartNumber = true;
        mDisplayField.setText("0.0");
        mPreviousOp  = "=";
        mLogic.setTotal("0.0");
    }

    /**
     * Set listeners for numeric and operator
     *
     */
    private void SetListener() {
        // Set Numeric Listeners
        Button button0= (Button) findViewById(R.id.button_0);
        button0.setOnClickListener(this);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button_6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.button_7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.button_8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.button_9);
        button9.setOnClickListener(this);
        Button pointButton = (Button) findViewById(R.id.button_point);
        pointButton.setOnClickListener(this);

        // Set Operators Listeners for 'All clear/Plus/Minus/Multiply/Divide/Calculate'
        Button backButton = (Button) findViewById(R.id.button_back);
        backButton.setOnClickListener(this);
        Button acButton = (Button) findViewById(R.id.button_ac);
        acButton.setOnClickListener(this);
        Button plusButton1 = (Button) findViewById(R.id.button_plus);
        plusButton1.setOnClickListener(this);
        Button minusButton1 = (Button) findViewById(R.id.button_minus);
        minusButton1.setOnClickListener(this);
        Button mulButton = (Button) findViewById(R.id.button_mul);
        mulButton.setOnClickListener(this);
        Button divButton = (Button) findViewById(R.id.button_div);
        divButton.setOnClickListener(this);
        Button calcButton = (Button) findViewById(R.id.button_calc);
        calcButton.setOnClickListener(this);
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
