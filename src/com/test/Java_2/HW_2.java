package com.test.Java_2;

/*
1. Массив размерностью 20, заполняется случайными целыми
числами от -10 до 10. Найти максимальный отрицательный и
минимальный положительный элементы массива. Поменять их
местами.
2. Формируется новогодний подарок. Он может включать в себя
разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
название, вес, цена и свой уникальный параметр. Необходимо
собрать подарок из сладостей. Найти общий вес подарка, общую
стоимость подарка и вывести на консоль информацию о всех
сладостях в подарке.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * класс для реализации домашнего задания №1 курса java 2.0
 * @author Frolov S.V.
 * @version 1.0
 */

public class HW_2 {

    /**
     * "Это основной метод выполняющий заданные функции
     * @param args параметры заданные при старте приложения
     * @exception Exception  если были введены не корректные значения то генерируется исключение
     * @see Exception
     * */

    public static void main(String[] args) {

        try {
            int mass[] = new int[20];
            int maxMin = -10;
            int maxMinPos = 0;
            int minMax = 10;
            int minMaxPos = 0;

            Random d = new Random();

            for (int i = 0; i < 20; i++) {
                mass[i] = -(d.nextInt(10));
                mass[++i] = (d.nextInt(10));
            }
            System.out.println();
            for (int i = 0; i < 20; i++) {
                if (mass[i]<0 && mass[i]>maxMin) {
                    maxMin = mass[i];
                    maxMinPos = i;
                }
                if (mass[i]>0 && mass[i]<minMax) {
                    minMax = mass[i];
                    minMaxPos = i;
                }
            }
            mass[minMaxPos] = maxMin;
            mass[maxMinPos] = minMax;

        } catch (Exception ex) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        System.exit(0);
    }
}
