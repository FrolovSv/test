package Math;

import com.Java_2.HW_5.Math.CalculateClass;
import com.Java_2.HW_5.Math.Subtraction;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TestCalculateClass {

    @org.junit.Test
    public void getResultComputation() throws EmptyDigits, EmptyResult {
        assertFalse("Проверка нулевого значения результата", new CalculateClass("2","1").computation()!=null);
    }

    @org.junit.Test
    public void getDigits() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","1");
        assertEquals("Проверка получения введенных чисел, число 1","2",calculateClass.getDigit1());
        assertEquals("Проверка получения введенных чисел, число 1","1",calculateClass.getDigit2());
    }

    @org.junit.Test
    public void getPrintResult() throws EmptyDigits, EmptyResult {
        try {
            assertEquals("Проверка проброса исключения", Double.parseDouble("0.0"), new CalculateClass("2", "2").printResult(), 0);
        } catch (EmptyResult ex) {
            assertEquals("Проверка проброса исключения, второе пустое","Мне жаль, но результат вычислений равен null",ex.getMessage());
        }
    }
}
