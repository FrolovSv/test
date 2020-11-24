package myExceptions;

import com.Java_2.HW_5.myExceptions.EmptyResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmptyResult {
    @Test
    public void getMessage(){
        try {
            throw new EmptyResult("тест");
        }catch (Exception exception){
            assertEquals("Проверка передачи сообщения об ошибке", exception.getMessage(),"тест");
        }
    }
}
