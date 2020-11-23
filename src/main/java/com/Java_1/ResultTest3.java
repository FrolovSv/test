package com.Java_1;

import java.util.Scanner;

/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
*/
public class ResultTest3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите текущий курс: ");
            String line = in.nextLine();
            double cource = Double.parseDouble((line.contains(",") ? line.replace(",","."): line));
            //double cource = 67.55d;
            System.out.print("Введите кол-во рублей: ");
            Integer rubl = Integer.parseInt(in.nextLine());
            //Integer rubl = 1000;

            System.out.printf("Итого: %.2f долларов",Double.valueOf(rubl/cource));
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Ошибка ввода/вывода данных с консоли");
            System.exit(0);
        }
        System.exit(0);
    }
}
