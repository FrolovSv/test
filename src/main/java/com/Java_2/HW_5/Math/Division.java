package com.Java_2.HW_5.Math;

import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;

/**
 * Класс деления для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class Division extends CalculateClass {
    public Division(String digit1, String digit2) throws EmptyDigits,EmptyResult {
        super(digit1, digit2);
        computation();
    }

    @Override
    public Double computation() throws EmptyResult {
        try {
            if (getDigit2().equals("0"))
                throw new ArithmeticException();
            else if (getDigit1().equals("0"))
                return 0d;
            else
                return Double.parseDouble(getDigit1()) / Double.parseDouble(getDigit2());
        }catch (ArithmeticException ex1){
            throw new EmptyResult(this.getClass().getName() + " " + ex1.getLocalizedMessage());
        }catch (Exception ex) {
            throw new EmptyResult(this.getClass().getName() + " " + ex.getLocalizedMessage());
        }
    }
}
