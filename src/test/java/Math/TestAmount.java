package Math;

import com.Java_2.HW_5.Math.Amount;
import com.Java_2.HW_5.Math.CalculateClass;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAmount {

    @Test
    public void getResultComputation() throws EmptyDigits, EmptyResult {
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("2.0"),new Amount("1","1").computation(),0);
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("0.0"),new Amount("0","0").computation(),0);
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("0.0"),new Amount("-1","1").computation(),0);
    }
    @Test
    public void getDigits() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","2");
        Amount amount = new Amount("1","1");
        assertEquals("Проверка работы наследования от класса родителя, число 1",calculateClass.getDigit1(),amount.getDigit1());
        assertEquals("Проверка работы наследования от класса родителя, число 2",calculateClass.getDigit2(),amount.getDigit2());
    }

    @Test
    public void getResultCalculateClass() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2", "2");
        Amount amount = new Amount("1", "1");
        amount.computation();
        try {
            assertEquals("Проверка проброса исключения при вызове родительского класса метода printResult()", "null", calculateClass.printResult());
        } catch (EmptyResult ex) {
            assertEquals("Проверка проброса исключения, второе пустое","Мне жаль, но результат вычислений равен null",ex.getMessage());
        }

    }

    @Test
    public void getPrintResult() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","2");
        Amount amount = new Amount("1","1");
        amount.computation();
        assertEquals("Проверка результата вычисления через printResult()",Double.parseDouble("2.0"),amount.printResult(),0);
    }

}
