package com.Java_2;

/*
2. Формируется новогодний подарок. Он может включать в себя
разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
название, вес, цена и свой уникальный параметр. Необходимо
собрать подарок из сладостей. Найти общий вес подарка, общую
стоимость подарка и вывести на консоль информацию о всех
сладостях в подарке.
 */

import java.util.ArrayList;

/**
 * класс для реализации домашнего задания №4 часть 2 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class HW_4_2 {

    /**
     * "Это основной метод выполняющий заданные функции
     *
     * @param args параметры заданные при старте приложения
     * @throws Exception если были введены не корректные значения то генерируется исключение
     * @see Exception
     */

    public static void main(String[] args) {
        ArrayList<Sweet> newYearGifts = new ArrayList<>();
        try {
            newYearGifts.add(new Sweet("chocolate", 0.1, 1.1));
            newYearGifts.add(new Sweet("marmalade", 0.2, 2.2));
            newYearGifts.add(new Sweet( "lollipops", 0.3, 3.3));
            newYearGifts.add(new Sweet( "toffee", 0.4, 4.4));
            newYearGifts.add(new Sweet( "truffle", 0.5, 5.0));

            Double priceTotal = 0.0;
            Double weightTotal = 0.0;

            System.out.println("Все подарки в мешке: ");
            for (Sweet swe : newYearGifts
            ) {
                priceTotal += swe.getPrice();
                weightTotal += swe.getWeight();
                System.out.println(swe.toString());
            }

            System.out.println("общая цена всех подарков: " + priceTotal);
            System.out.println("Общий вес всех подарков: " + weightTotal);

        } catch (Exception ex) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        System.exit(0);
    }


    /**
     * Дополнительный класс для реализации домашнего задания №4 часть2 курса java 2.0
     *
     * @author Frolov S.V.
     * @version 1.0
     */

    public static class Sweet {
        private String name = "";
        private double price = 0;
        private int id = 0;
        private double weight = 0;

        private static int count = 0;

        public Sweet(String name, double weight, double price) {
            this.id =  count++;
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Сладость {" +
                    "Название='" + name + '\'' +
                    ", стоимость=" + price + " руб." +
                    ", вес=" + weight + " гр." +
                    ", Уникальный номер=" + id +
                    '}';
        }

        public double getPrice() {
            return this.price;
        }

        public double getWeight() {
            return this.weight;
        }

    }


}
