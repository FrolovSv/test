package com.Java_2.HW_5.Math;

import com.Java_2.HW_5.myExceptions.EmptyResult;
import com.Java_2.HW_5.myExceptions.EmptyDigits;

/**
 * Класс суммирования для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class Amount extends CalculateClass{
    public Amount(String digit1, String digit2) throws EmptyDigits, EmptyResult {
        super(digit1, digit2);
        computation();
    }

    @Override
    public Double computation() throws EmptyResult {
        try {
            return Double.parseDouble(getDigit1()) + Double.parseDouble(getDigit2());
        } catch (Exception ex) {
            throw new EmptyResult(this.getClass().getName() + " " + ex.getMessage());
        }
    }
}
