package com.test.Java_1;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        int digit;
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите бинарное число: ");
            digit = Integer.parseInt(in.nextLine(),2);
            System.out.println("Данное число в десятичном формате = " + (+digit));
        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
