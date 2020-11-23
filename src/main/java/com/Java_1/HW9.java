package com.Java_1;

import java.util.Scanner;

public class HW9 {
//    Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
//    где каждый элемент массива умножается на 2. Размер массива задается пользователем.
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите величину массива: ");
            int length = Integer.parseInt(in.next());
            System.out.print("Введите значения в массив через запятую \",\": ");
            String[] line = in.next().split(",");
            int[] mass = new int[length];

            for (int i = 0; i < line.length; i++)
                mass[i] = Integer.parseInt(line[i]);

            for (int i = 0; i < mass.length; i++)
                System.out.println("Элемент массива " + i + " = " + 2*mass[i]);

        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
    }
}
