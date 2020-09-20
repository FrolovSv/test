package com.test;

import java.util.Scanner;

public class HW10 {
//    Произведите ввод данных с клавиатуры в матрицу, а после этого произведите
//    вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
//    Размерность матрицы задается пользователем.
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // вывод на экран сообщения о неоходимости ввода
            System.out.print("Введите размерность двумерной матрицы через запятую \",\": ");
            String[] matrixSize = in.next().split(",");
            int h1 = Integer.parseInt(matrixSize[0]);
            int h2 = Integer.parseInt(matrixSize[1]);
            int[][] matrix = new int[h1][h2];
            int nextLine = 0;
            while (nextLine<h2) {
                System.out.print("Введите значения "+(nextLine+1)+" строки матрицы через запятую \",\": ");
                String[] line = in.next().split(",");
                int[] firstLine = new int[line.length];
                for (int ii = 0; ii < h1; ii++)
                    matrix[ii][nextLine] = Integer.parseInt(line[ii]);
                nextLine++;
            }

            for (int matrixFLine = 0; matrixFLine < matrix.length; matrixFLine++)
                System.out.println("Элемент первой строки матрицы " + matrixFLine + " = " + 3*matrix[matrixFLine][0]);

        } catch (Exception ex) {
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
