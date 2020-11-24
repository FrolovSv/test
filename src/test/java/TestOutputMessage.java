import com.Java_2.HW_5.Controller;
import com.Java_2.HW_5.OutputMessage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class TestOutputMessage {
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
    public void testOutPutMessages(){
        try {
            OutputMessage.outInfoMess("test");
            Assert.assertEquals("Проверка outInfoMess()",new Date() +" [INFO] "+ "test"+"\r\n",outContent.toString());
            outContent.reset();

            OutputMessage.outResultMess(2d);
            Assert.assertEquals("Проверка outResultMess()",new Date() +" [RESULT] = "+ "2,0000",outContent.toString());

            OutputMessage.outErrorMess("error");
            Assert.assertEquals("Проверка outErrorMess()",new Date() +" [ERROR] "+ "error"+"\r\n",errContent.toString());
        }catch (Exception ex){
            Assert.assertFalse(ex.getMessage(),true);
        }
    }
}
