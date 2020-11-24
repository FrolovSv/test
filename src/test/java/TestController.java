import com.Java_2.HW_5.Controller;
import com.Java_2.HW_5.myExceptions.EmptyDigits;
import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class TestController {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStream(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testDefaultEmptyResult() throws EmptyResult, EmptyDigits {
        try {
            Controller controller = new Controller(")", "1", "1");
        }catch (EmptyResult exception){
            Assert.assertEquals("Проверка проброса исключения","Операция не распознана",exception.getMessage());
        }
    }

    @Test
    public void testDefaultEmptyDigits() throws EmptyResult, EmptyDigits {
        try {
            Controller controller = new Controller("*", "", "1");
        }catch (EmptyDigits exception){
            Assert.assertEquals("Проверка проброса исключения, первое пустое","Первое число не задано",exception.getMessage());
        }
        try {
            Controller controller = new Controller("-", "1", "");
        }catch (EmptyDigits exception){
            Assert.assertEquals("Проверка проброса исключения, второе пустое","Второе число не задано",exception.getMessage());
        }
        try {
            Controller controller = new Controller("/", "", "");
        }catch (EmptyDigits exception){
            Assert.assertEquals("Проверка проброса исключения, первое и второе пустое","Первое и второе число не заданы",exception.getMessage());
        }
    }

    @Test
    public void testCheckResults(){
        try {
            new Controller("+","1","0");
            Assert.assertEquals("Проверка вычислений суммы",new Date() +" [RESULT] = "+ "1,0000",outContent.toString());
            outContent.reset();

            new Controller("-","1","4");
            Assert.assertEquals("Проверка вычислений суммы",new Date() +" [RESULT] = "+ "-3,0000",outContent.toString());
            outContent.reset();

            new Controller("*","2","4");
            Assert.assertEquals("Проверка вычислений суммы",new Date() +" [RESULT] = "+ "8,0000",outContent.toString());
            outContent.reset();

            new Controller("/","3","1");
            Assert.assertEquals("Проверка вычислений суммы",new Date() +" [RESULT] = "+ "3,0000",outContent.toString());
        }catch (Exception ex){
            Assert.assertFalse(ex.getMessage(),true);
        }
    }

    @Test
    public void testErrorDivision() throws EmptyResult, EmptyDigits{
        try {
            new Controller("/","0","1");
            Assert.assertEquals("Проверка деления 0 на число",new Date() +" [RESULT] = "+ "0,0000",outContent.toString());
        }catch (EmptyResult ex){
            Assert.assertFalse(ex.getMessage(),true);
        }

        try {
            new Controller("/","1","0");
        }catch (EmptyResult ex){
            Assert.assertEquals("Проверка деления числа на ноль","Делить на ноль нельзя",ex.getMessage());
        }
    }
}
