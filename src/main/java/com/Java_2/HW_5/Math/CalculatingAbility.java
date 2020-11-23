package com.Java_2.HW_5.Math;

import com.Java_2.HW_5.myExceptions.EmptyResult;

/**
 * Интерфейс для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public interface CalculatingAbility {
    public Double computation() throws EmptyResult;
    public Double printResult() throws EmptyResult;
    public String getDigit1();
    public String getDigit2();
}
