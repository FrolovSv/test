package Math;

import com.Java_2.HW_5.Math.Amount;
import com.Java_2.HW_5.Math.CalculateClass;
import com.Java_2.HW_5.Math.Division;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDivision {

    @Test
    public void getResultComputation() throws EmptyDigits, EmptyResult {
        assertEquals("Проверка деления двух чисел не равных нулю", Double.parseDouble("1.0"), new Division("1", "1").printResult(), 0);
        assertEquals("Проверка деления двух чисел не равных нулю", Double.parseDouble("-1.0"), new Division("-1", "1").printResult(), 0);
        assertEquals("Проверка деления двух дробных чисел не равных нулю", Double.parseDouble("1.71875"), new Division("5.5", "3.2").printResult(), 0);
        assertEquals("Проверка кол-ва знаков в ответе после запятой", Double.parseDouble("0.3333333333333333"), new Division("1", "3").printResult(), 0);
        assertEquals("Проверка кол-ва знаков в ответе после запятой", Double.parseDouble("0.0"), new Division("0", "3").printResult(), 0);
        try {
            assertEquals("Проверка кол-ва знаков в ответе после запятой", Double.parseDouble("Infinity"), new Division("1", "0").printResult(), 0);
        } catch (EmptyResult ex) {
            assertTrue(true);
        }
    }

    @Test
    public void getDigits() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2", "2");
        Division division = new Division("1", "1");
        assertEquals("Проверка работы наследования от класса родителя, число 1", calculateClass.getDigit1(), division.getDigit1());
        assertEquals("Проверка работы наследования от класса родителя, число 2", calculateClass.getDigit2(), division.getDigit2());
    }

    @Test
    public void getResultCalculateClass() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2", "2");
        Division division = new Division("1", "1");
        division.computation();
        try {
            assertEquals("Проверка проброса исключения при вызове родительского класса метода printResult()", "null", calculateClass.printResult());
        } catch (EmptyResult ex) {
            assertEquals("Проверка проброса исключения, второе пустое","Мне жаль, но результат вычислений равен null",ex.getMessage());
        }

    }

    @Test
    public void getPrintResult() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2", "2");
        Amount amount = new Amount("1", "1");
        amount.computation();
        assertEquals("Проверка результата вычисления через printResult()", Double.parseDouble("2.0"), amount.printResult(), 0);
    }
}
