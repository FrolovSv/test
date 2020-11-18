package com.test.Java_2;

import java.util.Scanner;

/*      1. Начинаем писать калькулятор:
        Реализовать сложение дробных чисел, которые пользователь
        вводит в консоль. Использовать комментарии и JavaDoc при
        описании метода. Использовать форматирование при выводе
        результата в консоль. Полученный результат округлять до 4-х
        знаков после запятой.

        Пример работы программы для сложения целых чисел:

        2. Запушить проект в свой репозиторий на GitHub
        *Добавить возможность выбора другой операции (сложение,
        вычитание, деление, умножение)*/
/**
 * класс для реализации домашнего задания №1 курса java 2.0
 * @author Frolov S.V.
 * @version 1.0
*/

public class HW_1 {
    /**
     * "Это основной метод выполняющий заданные функции
     * @param args параметры заданные при старте приложения
     * @exception Exception  если были введены не корректные значения то генерируется исключение
     * @see Exception
     * */
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Старт калькулятора. Дроные числа вводятся со знаком \",\" между целой и дробной частью");
            System.out.println("Введите тип операции. Дотсупные операции (+,-,*,/):");
            String oper = in.nextLine();

            System.out.println("Введите первое число:");
            double digit1 = in.nextDouble();

            System.out.println("Введите второе число:");
            double digit2 = in.nextDouble();

            switch (oper) {
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


        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
