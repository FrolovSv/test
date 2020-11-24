package com.Java_2.HW_5;

import java.util.Date;

/**
 * класс для реализации домашнего задания №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class OutputMessage {
    public static void outInfoMess(String str){
        System.out.println(new Date() +" [INFO] "+ str);
    }
    public static void outErrorMess(String str){
        System.err.println(new Date() +" [ERROR] "+ str);
    }
    public static void outResultMess(Double result){
        System.out.printf(new Date() +" [RESULT] = %.4f",result);
    }
}
