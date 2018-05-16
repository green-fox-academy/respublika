import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    @Test
    public void testCountLetters() throws Exception {
        String testString="bla bla bla";

        HashMap testMap=CountLetters.countLetters(testString);

        int expectedOut = 3;
        int resultOut =  (Integer) testMap.get('b');

        assertEquals("count letters fails", expectedOut, resultOut);
    }

}