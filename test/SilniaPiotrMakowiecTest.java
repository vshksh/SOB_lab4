/**
 * Created by piotr on 5/24/2017.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SilniaPiotrMakowiecTest
{
    @Test
    public void Given_Element_WhenRecursiveSilniaIsCalculating_OutputCalculatedValue()
    {
        long expected = 5040;
        long result = -1;
        try
        {
            result = SilniaPiotrMakowiec.ObliczRekurencyjnie(Long.valueOf(7));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        Assertions.assertEquals(expected, result);

    }

    @Test
    public void Given_Element_WhenIterativeSilniaIsCalculating_OutputCalculatedValue()
    {
        long expected = 5040;
        long result = -1;
        try
        {
            result = SilniaPiotrMakowiec.ObliczIteracyjnie(Long.valueOf(7));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        Assertions.assertEquals(expected, result);

    }

    @Test
    public void Given_HugeElement_WhenBothSilniaAlgorithmIsRunning_Output_IterativeIsFaster()
    {
        boolean expected = true;

        double iterative = CalculateIterativeAlgorithmTime();
        double recursive = CalculateRecursiveAlgorithmTime();

        boolean result = false;

        if(iterative > recursive)
        {
            result = true;
        }

        Assertions.assertEquals(expected, result);


    }

    private double CalculateRecursiveAlgorithmTime()
    {
        double startTime = System.currentTimeMillis();
        long result = -1;
        try
        {
            result = SilniaPiotrMakowiec.ObliczRekurencyjnie(Long.valueOf(30));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    private double CalculateIterativeAlgorithmTime()
    {
        double startTime = System.currentTimeMillis();
        long result = -1;
        try
        {
            result = SilniaPiotrMakowiec.ObliczIteracyjnie(Long.valueOf(30));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

}
