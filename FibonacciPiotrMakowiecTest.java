package sob_lab4; /**
 * Created by piotr on 5/23/2017.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciPiotrMakowiecTest
{

    @Test
    public void Given_ElementToCalculate_When_Fibonacci_Output_Calculated()
    {
        long expected = 5;

        long result = 0;
        try
        {
            result = FibonacciPiotrMakowiec.Fib(Long.valueOf(5));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void Given_MaxElementToCalculate_When_Fibonacci_Output_Calculated()
    {
        long startTime = System.currentTimeMillis();
        try
        {
            long result = FibonacciPiotrMakowiec.Fib(Long.valueOf(20));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        long estimatedTime = System.currentTimeMillis() - startTime;

        boolean resultTime = false;
        if(estimatedTime < 70000)
        {
            resultTime = true;
        }

        Assertions.assertEquals(true, resultTime);
    }
}
