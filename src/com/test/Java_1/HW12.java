package com.test.Java_1;

import java.util.Scanner;

//Для введенной с клавиатуры строки необходимо провести отсев пробелов.
//Результат в виде строки без пробелов вывести на экран.

public class HW12 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите любую строку в которо нужно убрать пробелы: ");
            String String = in.nextLine();
            System.out.println("Результат: " + String.replace(" ", ""));
        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
