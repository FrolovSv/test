package com.Java_1;

/*
Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S
2. Конвертация строковой переменной S в числовую переменную X типа int
3. Конвертация числа X типа int в число Y типа double
Все три числа разных типов необходимо в столбик вывести на экран
*/

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите число: ");
            String S = in.nextLine();
            int X = Integer.parseInt(S);
            double Y = Double.valueOf(X);
            System.out.println("Строка S : "+S);
            System.out.println("Число типа int X: "+X);
            System.out.println("Число типа double Y: "+Y);
        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
