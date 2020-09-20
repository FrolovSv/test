package com.test;

/*
Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.
*/

import java.io.*;

public class HW17 {

    public static void main(String[] args) {
        try {
            String s;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Чтобы закончить ввод, введи \"стоп\"");

            try(FileWriter file = new FileWriter("testWrite.txt")){
                System.out.print("Введите данные: ");
                do {
                    s = br.readLine();
                    if (s.compareTo("стоп")==0) break;
                    s += "\r\n";
                    file.write(s);
                }while (s.compareTo("стоп") !=0);

            }catch (IOException ex){
                System.err.println("Ошибка создание/ сохранения файла");
            }

        }catch (Exception ex){
            System.err.println("Ошибка ввода с консоли");
        }
        System.exit(0);
    }
}
