package com.Java_1;

import java.util.Scanner;

//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

public class HW11 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите любую строку: ");
            String String = in.nextLine();
            System.out.println("Вы ввели слудющую строку: " + String);
        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
