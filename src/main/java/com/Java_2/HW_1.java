package com.Java_2;

import java.util.Scanner;

/*      1. Начинаем писать калькулятор:
        Реализовать сложение дробных чисел, которые пользователь
        вводит в консоль. Использовать комментарии и JavaDoc при
        описании метода. Использовать форматирование при выводе
        результата в консоль. Полученный результат округлять до 4-х
        знаков после запятой.

        2. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания

        3. Поиск максимального элемента в массиве. Для начала задать массив слов.
        Размерность массива произвольна, задается в консоли.
        После чего в консоли вводятся слова в количестве равном заданной длине массива.
        В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль*/

/**
 * класс для реализации домашнего задания №1,2,3 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class HW_1 {
    /**
     * "Это основной метод выполняющий заданные функции
     *
     * @param args параметры заданные при старте приложения
     * @throws Exception если были введены не корректные значения то генерируется исключение
     * @see Exception
     */
    public static void main(String[] args) {

        int number = 0;
        while (number < 10) {
            System.out.println("Number is:" + number);
            ++number;
        }

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Для выбора режима работы введите число: 1 - выполнение калькулятора, 2 - поиск максимального слова в массиве.");
            if (in.nextInt() == 1) {
                System.out.println("Старт \"Калькулятор\". Дробные числа вводятся со знаком \",\" между целой и дробной частью");
                System.out.println("Введите тип операции. Дотсупные операции (+,-,*,/):");
                String operation = in.nextLine();

                System.out.println("Введите первое число:");
                double digit1 = in.nextDouble();

                System.out.println("Введите второе число:");
                double digit2 = in.nextDouble();

                switch (operation) {
                    case "+":
                        System.out.printf("Сумма чисел равна: %.4f", (digit1 + digit2));
                        break;
                    case "-":
                        System.out.printf("Разность чисел равна: %.4f", (digit1 - digit2));
                        break;
                    case "*":
                        System.out.printf("Произведение чисел равна: %.4f", (digit1 * digit2));
                        break;
                    case "/":
                        System.out.printf("Деление чисел равна: %.4f", (digit1 / digit2));
                        break;
                }
            } else {
                System.out.println("Старт \"Поиск максимального слова в массиве\".");
                System.out.println("Введите количество слов для массива:");
                int count = in.nextInt();
                String[] mass = new String[count];
                int max = 0;
                for (int i = 0; i < count; i++) {
                    System.out.println("Введите " + (i + 1) + "-ое слово:");
                    mass[i] = in.next();
                    if (mass[i].length() > max)
                        max = i;
                }
                System.out.println("Самое большое слово в массиве = " + mass[max]);

            }


        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
