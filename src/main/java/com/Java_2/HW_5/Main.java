package com.Java_2.HW_5;

import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;

import java.util.Scanner;

/**
 * Главный класс для запуска ДЗ №5 курса java 2.0
 *
 * @author Frolov S.V.
 * @version 1.0
 */

public class Main {

    /**
     * "Это основной метод выполняющий заданные функции
     *
     * @param args параметры заданные при старте приложения
     * @throws EmptyDigits если значения не были введны (такое врядли может быть, но все же)
     * @throws EmptyResult если какие-то проблеимы с вычислениями (что тоже врятли), либо вызвали метод получения результата, без самого вычисления
     * @throws Exception для всего остального
     * @see Exception
     */

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            OutputMessage.outInfoMess("Пристегните ремни. Настало время нового калькулятора :)");
            System.out.println("Выбирете тип операции (+,-,/,*):");
            String operation = in.nextLine().replace(" ","");

            System.out.println("Введите первое число:");
            String digit1 = in.nextLine().replace(" ","");

            System.out.println("Введите второе число:");
            String digit2 = in.nextLine().replace(" ","");

            new Controller(operation,digit1,digit2);

        } catch (EmptyDigits empD) {
            OutputMessage.outErrorMess(empD.getMessage());
        } catch (EmptyResult empR) {
            OutputMessage.outErrorMess(empR.getMessage());
        } catch (Exception e) {
            OutputMessage.outErrorMess(e.getMessage());
        }
    }
}
