package com.sb.android.calculator.utility;

/**
 * Created by Administrator on 2015-10-05.
 */
public class CalcLogic {

    //-- Instance variables.
    // The current total is all we need to remember.
    private Float mCurrentTotal;

    /** Constructor */
    public CalcLogic() {
        mCurrentTotal = 0.0f;
    }

    public String getTotalString() {
        return "" + mCurrentTotal;
    }

    public void setTotal(String n) {
        mCurrentTotal = convertToNumber(n);
    }

    public void add(String n) {
        mCurrentTotal += convertToNumber(n);
    }

    public void subtract(String n) {
        mCurrentTotal -= convertToNumber(n);
    }

    public void multiply(String n) {
        mCurrentTotal *= convertToNumber(n);
    }

    public void divide(String n) {
        mCurrentTotal /= convertToNumber(n);
    }

    private Float convertToNumber(String n) {
        return Float.parseFloat(n);
    }
}
