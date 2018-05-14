import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testAnagramFunction() throws Exception {
        //TODO Arrange
        //String string1="dog";
        String string1="dogx";
        //String string1="blabla";
        String string2="god";
        //TODO Act
        //boolean expectedOut = true;
        boolean expectedOut = false;
        boolean resultOut = Anagram.anagram(string1, string2);
        //TODO Assert
        assertEquals("anagram fails", expectedOut, resultOut);
    }

}