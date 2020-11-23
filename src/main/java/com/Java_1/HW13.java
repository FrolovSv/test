package com.Java_1;

/*
Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствующее сообщение.
*/

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите первую строку: ");
            String Line1 = in.nextLine();
            System.out.print("Введите первую строку: ");
            String Line2 = in.nextLine();
            if (Line1.length()>Line2.length())
                System.out.println("Первая строка длинее: "+ Line1);
            else if (Line1.length()<Line2.length())
                System.out.println("Вторая строка длинее: "+Line2);
            else
                System.out.println("Первая и вторая строка одинаковой длины");

        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }


}
