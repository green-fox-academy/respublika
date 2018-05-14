import org.junit.Test;
import static org.junit.Assert.*;

public class AppleTest {

    Apple myObject=new Apple();
    //Apple myObject=new Apple("pear");
    //Apple myObject=new Apple("apple");

    @Test
    public void testPrintApple() throws Exception {
        //TODO Arrange

        //TODO Act
        String expectedOut = "apple";
        String resultOut = myObject.getApple();
        //TODO Assert
        assertEquals("apple is not apple", expectedOut, resultOut);
    }

}
