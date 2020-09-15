package com.test;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите число: ");
            int digit = in.nextInt();
            System.out.println("1  * " + digit + " = " + (1*digit));
            System.out.println("2  * " + digit + " = " + (2*digit));
            System.out.println("3  * " + digit + " = " + (3*digit));
            System.out.println("4  * " + digit + " = " + (4*digit));
            System.out.println("5  * " + digit + " = " + (5*digit));
            System.out.println("6  * " + digit + " = " + (6*digit));
            System.out.println("7  * " + digit + " = " + (7*digit));
            System.out.println("8  * " + digit + " = " + (8*digit));
            System.out.println("9  * " + digit + " = " + (9*digit));
            System.out.println("10 * " + digit + " = " + (10*digit));
        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
