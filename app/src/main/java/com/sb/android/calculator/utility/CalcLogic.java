package com.sb.android.calculator.utility;

/**
 * Created by Administrator on 2015-10-05.
 */
public class CalcLogic {

    //-- Instance variables.
    // The current total is all we need to remember.
    private Float _currentTotal;

    /** Constructor */
    public CalcLogic() {
        _currentTotal = 0.0f;
    }

    public String getTotalString() {
        return "" + _currentTotal;
    }

    public void setTotal(String n) {
        _currentTotal = convertToNumber(n);
    }

    public void add(String n) {
        _currentTotal += convertToNumber(n);
    }

    public void subtract(String n) {
        _currentTotal -= convertToNumber(n);
    }

    public void multiply(String n) {
        _currentTotal *= convertToNumber(n);
    }

    public void divide(String n) {
        _currentTotal /= convertToNumber(n);
    }

    private Float convertToNumber(String n) {
        return Float.parseFloat(n);
    }
}
