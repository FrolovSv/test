package com.Java_2.HW_5.Math;

import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;

/**
 * Главный класс с локигой классов вычислений для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class CalculateClass implements CalculatingAbility{
//public class CalculateClass {
    private static String Digit1;
    private static String Digit2;
    private Double Result;

    public CalculateClass(String digit1, String digit2){
        this.Digit1 = digit1.replace(",",".");
        this.Digit2 = digit2.replace(",",".");
        this.Result = null;
    }

    @Override
    public Double computation() throws EmptyResult {
        return Result;
    }

    @Override
    public Double printResult() throws EmptyResult {
        Result = computation();
        if (Result == null) {
            throw new EmptyResult("Мне жаль, но результат вычислений равен null");
        } else {
            return Result;
        }
    }

    @Override
    public String getDigit1() {
        return this.Digit1;
    }

    @Override
    public String getDigit2() {
        return this.Digit2;
    }

}
