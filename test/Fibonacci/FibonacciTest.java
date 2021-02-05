package Fibonacci;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)  //annotation
public class FibonacciTest {
    //public static method pou epistrefei mia collection apo objects san array
    @Parameters  //annotation
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }  
        });
    }

    private int fInput;
    private int fExpected;

    //domitis pou pernei mia seira apo data (2 tin kathe fora)
    public FibonacciTest(int input, int expected) {
        fInput = input;
        fExpected = expected;
    }

    //test case pou emplekei tin eisodo kai tin expected
    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
        System.out.println(Fibonacci.compute(fInput));
    }
    
}
