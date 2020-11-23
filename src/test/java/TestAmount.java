import com.Java_2.HW_5.Math.Amount;
import com.Java_2.HW_5.Math.CalculateClass;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAmount {

    @Test
    public void getResultComputation() throws EmptyDigits, EmptyResult {
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("2.0"),new Amount("1","1").computation(),0);
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("0.0"),new Amount("0","0").computation(),0);
        assertEquals("Проверка суммы двух чисел",Double.parseDouble("0.0"),new Amount("-1","1").computation(),0);
    }
    @Test
    public void getDigit1() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","2");
        Amount amount = new Amount("1","1");
        assertEquals("Проверка работы наследования от класса родителя",calculateClass.getDigit1(),amount.getDigit1());
        assertEquals("Проверка работы наследования от класса родителя",calculateClass.getDigit2(),amount.getDigit2());
    }

    @Test
    public void getPrintResult() throws EmptyDigits, EmptyResult {
        CalculateClass calculateClass = new CalculateClass("2","2");
        Amount amount = new Amount("1","1");
        amount.computation();
        assertEquals("Проверка результата вычисления через printResult()",Double.parseDouble("2.0"),amount.printResult(),0);
    }
}
