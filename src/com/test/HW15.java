package com.test;

//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//Использовать пузырьковый метод сортировки.

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите числа для сортировки через запятую пробел \" \": ");
            String[] numbers =in.nextLine().split(" ");
            int[] intNumbers = new int[numbers.length];
            for (int ii = 0; ii < numbers.length;ii++){
                intNumbers[ii] = Integer.parseInt(numbers[ii]);
            }

            for(int i = intNumbers.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
                    if( intNumbers[j] > intNumbers[j+1] ){
                        int tmp = intNumbers[j];
                        intNumbers[j] = intNumbers[j+1];
                        intNumbers[j+1] = tmp;
                    }
                }
            }
            String res = "";
            for (int y = 0; y < intNumbers.length;y++){
                res += " " + intNumbers[y];
            }
            System.out.println("Результат сортировки пузырьком:" + res);

        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
