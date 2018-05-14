import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class SumFunctionTest {
    ArrayList<Integer> listToSum=new ArrayList<>();

    @Test
    public void testSumFunctionNull() throws NullPointerException {
        System.out.println("testSumFunctionNull");
        //TODO Arrange
        //TODO Act
        int expectedOut = 0;
        int resultOut = SumFunction.sumFunction(listToSum);
        //TODO Assert
        assertEquals("sumFunction not working with nullList", expectedOut, resultOut);
    }

    @Test
    public void testSumFunctionOneElement() throws Exception {
        System.out.println("testSumFunctionOneElement");
        //TODO Arrange
        listToSum.add(2);
        //TODO Act
        int expectedOut = 2;
        int resultOut = SumFunction.sumFunction(listToSum);
        //TODO Assert
        assertEquals("sumFunction not working with nullList", expectedOut, resultOut);
    }

    @Test
    public void testSumFunctionMoreElement() throws Exception {
        System.out.println("testSumFunctionMoreElement");
        //TODO Arrange
        listToSum.add(1);
        listToSum.add(2);
        listToSum.add(3);
        //TODO Act
        int expectedOut = 6;
        int resultOut = SumFunction.sumFunction(listToSum);
        //TODO Assert
        assertEquals("sumFunction not working", expectedOut, resultOut);
    }

    @Test
    public void testSumFunctionNullElement() throws NullPointerException {
        System.out.println("testSumFunctionNullElement");
        //TODO Arrange
        listToSum.add(1);
        listToSum.add(null);
        listToSum.add(3);
        //TODO Act
        int expectedOut = 4;
        int resultOut = SumFunction.sumFunction(listToSum);
        //TODO Assert
        assertEquals("sumFunction not working", expectedOut, resultOut);
    }

}