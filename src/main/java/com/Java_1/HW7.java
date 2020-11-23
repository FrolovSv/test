package com.Java_1;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
//    Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число
//    в переменную number. В программе должны присутствовать константы X, Y, Z.
//    Программа должна сравнивать введенное значение с клавиатуры со значением констант и
//    вывести на экран сообщение "Данное значение имеется в константах"
//    если number=X или Y или Z. Если переменная отличается от констант,
//    нужно вывести оповещение "Такой константы нет!"
        int X = 10;
        int Y = 20;
        int Z = 30;
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите число: ");
            int number = in.nextInt();
            if (number==X || number==Y || number==Z)
                System.out.println("Данное значение имеется в константах");
            else if(number!=X && number!=Y && number!=Z)
                System.out.println("Такой константы нет");

        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);

    }
}
