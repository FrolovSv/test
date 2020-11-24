package Math;

import com.Java_2.HW_5.Math.Amount;
import com.Java_2.HW_5.Math.CalculateClass;
import com.Java_2.HW_5.Math.Subtraction;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TestSubtraction {

    @org.junit.Test
    public void getResultComputation() throws EmptyDigits, EmptyResult {
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("0.0"),new Subtraction("1","1").computation(),0);
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("0.0"),new Subtraction("0","0").computation(),0);
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("-2.0"),new Subtraction("-1","1").computation(),0);
    }
    @org.junit.Test
    public void getDigits() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","2");
        Subtraction subtraction = new Subtraction("1","1");
        assertEquals("Проверка работы наследования от класса родителя, число 1",calculateClass.getDigit1(),subtraction.getDigit1());
        assertEquals("Проверка работы наследования от класса родителя, число 2",calculateClass.getDigit2(),subtraction.getDigit2());
    }

    @org.junit.Test
    public void getResultCalculateClass() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2", "2");
        Subtraction subtraction = new Subtraction("1", "1");
        subtraction.computation();
        try {
            assertEquals("Проверка проброса исключения при вызове родительского класса метода printResult()", "null", calculateClass.printResult());
        } catch (EmptyResult ex) {
            assertEquals("Проверка проброса исключения, второе пустое","Мне жаль, но результат вычислений равен null",ex.getMessage());
        }

    }

    @org.junit.Test
    public void getPrintResult() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","2");
        Subtraction subtraction = new Subtraction("1","1");
        subtraction.computation();
        assertEquals("Проверка результата вычисления через printResult()",Double.parseDouble("0.0"),subtraction.printResult(),0);
    }
}
