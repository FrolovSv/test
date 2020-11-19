package com.test.Java_2.HW_5;

import com.test.Java_2.HW_5.Math.Division;
import com.test.Java_2.HW_5.Math.Multiplication;
import com.test.Java_2.HW_5.Math.Subtraction;
import com.test.Java_2.HW_5.Math.Summ;
import com.test.Java_2.HW_5.myExceptions.EmptyDigits;
import com.test.Java_2.HW_5.myExceptions.EmptyResult;

/**
 * класс для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class Controller {
    public Controller(String operation, String digit1, String digit2) throws EmptyResult, EmptyDigits {
        switch (operation) {
            case "+":
                OutputMessage.outResultMess(new Summ(digit1, digit2).printResult());
                break;
            case "-":
                OutputMessage.outResultMess(new Subtraction(digit1, digit2).printResult());
                break;
            case "*":
                OutputMessage.outResultMess(new Multiplication(digit1, digit2).printResult());
                break;
            case "/":
                OutputMessage.outResultMess(new Division(digit1, digit2).printResult());
                break;
            default:
                OutputMessage.outErrorMess("Введенная операция не распознана");
                break;
        }
    }
}
