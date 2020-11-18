package com.test.Java_1;

import java.io.*;

/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
*/
public class HW18 {

    public static void main(String[] args) {
        String s;
        Integer lines = 1;
        try(BufferedReader br = new BufferedReader(new FileReader("test18.txt"))) {
            while ((s=br.readLine()) != null){
                System.out.println("Строка "+ lines++ +" в файле: " + s);
            }
        }catch (IOException ex){
            System.err.println("Ошибка чтения файла");
        }

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы закончить ввод, введи \"стоп\"");

        try(FileWriter file = new FileWriter("test18.txt", false)){
            int writeLines = 1;
            while(writeLines < lines){
                System.out.print("Заменитез данные в "+writeLines+" строке: ");
                str = br.readLine();
                str += "\r\n";
                file.write(str);
                writeLines++;
            }
            System.out.println("Файл успешно перезаписан");
        }catch (IOException exp){
            System.err.println("Ошибка создание/сохранения файла");
        }
        System.exit(0);
    }
}
