import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void testCountLetters1() throws Exception {
        String testString="apple";

        HashMap testMap=CountLetters.countLetters(testString);

        int expectedOut = 1;
        int resultOut =  (Integer) testMap.get('a');

        assertEquals("count letters fails", expectedOut, resultOut);
    }


    @Test
    public void testCountLetters2() throws Exception {
        String testString="apple";

        HashMap testMap=CountLetters.countLetters(testString);

        int expectedOut = 2;
        int resultOut =  (Integer) testMap.get('p');

        assertEquals("count letters fails", expectedOut, resultOut);
    }

    @Test
    public void testCountLetters3() throws Exception {
        String testString="bla bla bla";

        HashMap testMap=CountLetters.countLetters(testString);

        int expectedOut = 3;
        int resultOut =  (Integer) testMap.get('b');

        assertEquals("count letters fails", expectedOut, resultOut);
    }

    @Test
    public void testCountLetters4() throws Exception {
        String testString="bla bla bla";

        HashMap testMap=CountLetters.countLetters(testString);

        int expectedOut = 2;
        int resultOut =  (Integer) testMap.get(' ');

        assertEquals("count letters fails", expectedOut, resultOut);
    }

}