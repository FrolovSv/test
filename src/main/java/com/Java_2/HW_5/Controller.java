package com.Java_2.HW_5;

import com.Java_2.HW_5.Math.Division;
import com.Java_2.HW_5.Math.Multiplication;
import com.Java_2.HW_5.Math.Subtraction;
import com.Java_2.HW_5.Math.Amount;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;

/**
 * класс для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class Controller {
    public Controller(String operation, String digit1, String digit2) throws EmptyResult, EmptyDigits {
        if (digit1.equals("") && digit2.equals("")){
            throw new EmptyDigits("Первое и второе число не заданы");
        }else if (digit1.equals("")){
            throw new EmptyDigits("Первое число не задано");
        }else if (digit2.equals("")){
            throw new EmptyDigits("Второе число не задано");
        }else {
            switch (operation) {
                case "+":
                    OutputMessage.outResultMess(new Amount(digit1, digit2).printResult());
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
                    throw new EmptyResult("Операция не распознана");
            }
        }
    }
}
