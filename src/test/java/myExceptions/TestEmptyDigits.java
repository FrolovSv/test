package myExceptions;

import com.Java_2.HW_5.myExceptions.EmptyDigits;
import org.junit.Assert;
import org.junit.Test;

public class TestEmptyDigits {
    @Test
    public void getMessage(){
        try {
            throw new EmptyDigits("тест");
        }catch (Exception exception){
            Assert.assertEquals("Проверка передачи сообщения об ошибке", exception.getMessage(),"тест");
        }
    }
}
