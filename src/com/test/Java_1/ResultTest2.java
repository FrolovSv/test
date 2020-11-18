package com.test.Java_1;

/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
*/

import java.util.Random;
import java.util.Scanner;

public class ResultTest2 {
    static int[] mass;
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите величину массива: ");
            int length = Integer.parseInt(in.next());
            //int length = 5;
            System.out.print("Введите значения в массив через запятую \",\": ");
            String[] line = in.next().split(",");
            //String[] line = {"-1","4","6","2","5"};
            int[] mass = new int[length];
            for (int i = 0; i < line.length; i++) {
                mass[i] = Integer.parseInt(line[i]);
            }

            switch (new Random().nextInt(4)+1){
            //switch (4){
                case 1:
                    printArray("Сортировка методом вставки", localInsertIntoSorts(mass));
                    break;
                case 2:
                    printArray("Сортировка методом прямого выбора", directSelectionMethod(mass));
                    break;
                case 3:
                    printArray("Метод быстрой сортировки", quickSort(mass, 0, mass.length - 1));
                    break;
                case 4:
                    printArray("Сортировка методом Шелла", shellSort(mass));
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }

    }

    static int[] localInsertIntoSorts(int[] arr) {
        int temp, j;
        int[] array = arr;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        return array;
    }


    static void printArray(String method, int[] array){
        System.out.println(method+": ");
        for(int i=0;i<array.length;i++){
            System.out.println("i = "+array[i]);
        }
    }

    static int[] directSelectionMethod(int[] arr){
        int[] array = arr;
        for (int i = 0;i < (array.length - 1);i++){
            int maxItem = array[i];
            for(int j = i + 1 ; j < array.length ; j++){
                if (maxItem > array[j]){
                    array[i] = array[j];
                    array[j] = maxItem;
                    maxItem = array[i];
                }
            }
        }
        return array;
    }

    public static int[] quickSort(int[] arr, int low, int high) {
        int[] array = arr;
        if (array.length == 0)
            return array;

        if (low >= high)
            return array;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
        return array;
    }

    static int[] shellSort(int[] arr) {
        int[] array = arr;
        int h = 1;
        int n = array.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
            h = h / 3;
        }
        return array;
    }


}
