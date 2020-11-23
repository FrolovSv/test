package com.Java_1;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
//        Написать программу, которая будет выполнять следующие действия:
//        1. Ввод трех чисел с клавиатуры x, y, z
//        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//        3. Деление среднего арифметического на 2 без остатка
//        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите три числа через запятую \",\": ");
            String[] line = in.nextLine().split(",");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int z = Integer.parseInt(line[2]);
            Double arif = (x+y+z)/3.0;
            System.out.printf("среднего арифметического чисел %d, %d, %d = %.2f",x,y,z,arif);
            if (arif % 2 > 3) System.out.println("Программа выполнена корректно");
        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);

    }
}
