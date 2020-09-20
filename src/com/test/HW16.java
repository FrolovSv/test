package com.test;

//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HW16 {
    public static void main(String[] args) {
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            int i = 1;
            while ((s=br.readLine()) != null){
                System.out.println("Строка "+ i++ +" в файле: " + s);
            }

        }catch (IOException ex){
            System.err.println("Ошибка чтения файла");
        }
        System.exit(0);
    }

}
