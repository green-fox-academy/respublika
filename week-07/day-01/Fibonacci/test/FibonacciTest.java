import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void FibonacciTest1() throws Exception {

        long expectedOut = 0;
        long resultOut =  (long) Fibonacci.creatFibonacci(0);

        assertEquals("Fibonacci doesn't know his job :(", expectedOut, resultOut);
    }

    @Test
    public void FibonacciTest2() throws Exception {

        double expectedOut = 1;
        double resultOut =  Fibonacci.creatFibonacci(1);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest3() throws Exception {

        double expectedOut = 1;
        double resultOut =  Fibonacci.creatFibonacci(2);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest4() throws Exception {

        double expectedOut = 2;
        double resultOut =  Fibonacci.creatFibonacci(3);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest5() throws Exception {

        double expectedOut = 3;
        double resultOut =  Fibonacci.creatFibonacci(4);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest6() throws Exception {

        double expectedOut = 5;
        double resultOut =  Fibonacci.creatFibonacci(5);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest7() throws Exception {

        double expectedOut = 8;
        double resultOut =  Fibonacci.creatFibonacci(6);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest8() throws Exception {

        double expectedOut = 13;
        double resultOut =  Fibonacci.creatFibonacci(7);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest9() throws Exception {

        double expectedOut = 21;
        double resultOut =  Fibonacci.creatFibonacci(8);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest10() throws Exception {

        double expectedOut = 34;
        double resultOut =  Fibonacci.creatFibonacci(9);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest11() throws Exception {

        double expectedOut = 514229;
        double resultOut =  Fibonacci.creatFibonacci(29);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest12() throws Exception {

        double expectedOut = 806515533049393L ;
        double resultOut =  Fibonacci.creatFibonacci(73);

        assertEquals( expectedOut, resultOut,0);
    }

    @Test
    public void FibonacciTest13() throws Exception {

        double expectedOut = 2427893228399975082453D ;
        double resultOut =  Fibonacci.creatFibonacci(104);

        assertEquals( expectedOut, resultOut,10000000);
    }



}