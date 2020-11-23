package com.Java_2.HW_5.myExceptions;

/**
 * Мой класс исключений для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class EmptyResult extends Exception{
    public EmptyResult(String mess){
        super(mess);
    }
}
