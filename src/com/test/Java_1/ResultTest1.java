package com.test.Java_1;

import java.util.Scanner;

/*
Ввести с консоли число в бинарном формате.
Перевести его в десятичный формат, записать в переменную int и вывести на экран.
Необходимо использовать циклы, нельзя использования готовые методы языка Java,
для перевода числа из одной системы счисления в другую.
*/
public class ResultTest1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите бинарное число: ");
            String str = in.nextLine();
            int result = 0;
            if(str.contains("1") || str.contains("0"))
                for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
                    result += (str.charAt(i) - '0') * j;
                }
            else System.err.println("Число не бинарное");

            System.out.println("Введенное число в десятичном формате = " + result);
        } catch (Exception ex) {
            System.err.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
