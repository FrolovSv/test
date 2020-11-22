package com.test.Java_2;

import java.io.*;
import java.util.*;

/*
Задание №6:
Есть входной файл с набором слов, написанных через пробел
Необходимо:
Прочитать слова из файла.
Отсортировать в алфавитном порядке.
Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
*/


/**
 * класс для реализации домашнего задания №6 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class HW_6 {
    public static void main(String[] args) {
        try {
            ArrayList<String> stringList = new ArrayList<>();
            Integer lines = 1;
            BufferedReader br = new BufferedReader(new FileReader("test_HW_6.txt"));
            String s = br.readLine().trim();
            //System.out.println(s);
            if (s.length() > 0 && s.contains(" ")) {
                String[] subString = s.split(" ");
                for (int i = 0; i < subString.length; i++) {
                    if (!subString[i].equals(""))
                        stringList.add(subString[i]);
                }
                int max = 0;
                String strMaxCount = stringList.get(0);
                System.out.println("Статистика повторений слов в файле:");
                Set<String> stringSet = new TreeSet<>();
                for (String str : stringList) {
                    stringSet.add(str);
                }

                for (String str : stringSet) {
                    stringList.sort(String::compareTo);
                    int frequency = Collections.frequency(stringList, str);
                    System.out.println("Слово \"" + str + "\" встречается " + frequency + " раз.");
                    if (frequency > max) {
                        max = frequency;
                        strMaxCount = str;
                    }
                }
                System.out.println("\n\rПервое Слово \"" + strMaxCount + "\" встречающееся чаще всех, т.е " + max +" раз. ");
            } else if (s.length() > 0 && !s.contains(" ")) {
                System.out.println("Слово \"" + s + "\" встречается " + 1 + " раз");
                System.out.println("\n\rСлово \"" + s + "\" единственное, т.е встречается " + 1 + " раз.");
            } else {
                System.err.printf("Файл заполнен не корректно");
            }
        } catch (Exception ex) {
            System.err.println("Ошибка чтения файла");
        }
    }
}
