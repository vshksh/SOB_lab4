package sob_lab4;

/**
 * Created by piotr on 5/23/2017.
 */
public class SilniaPiotrMakowiec
{
    /**
     * @param n element we wanna calculate by Silnia
     * @return Silnia value of element
     */
    public static Long ObliczRekurencyjnie(Long n) throws Exception
    {
        if(n<0) throw new Exception("Value cannot be less than 0");
        if(n < 1)
        {
            return Long.valueOf(1);
        }
        else
        {
            return n * ObliczRekurencyjnie(n - 1);
        }
    }

    /**
     * @param n element we wanna calculate by Silnia
     * @return Silnia value of element
     */
    public static Long ObliczIteracyjnie(Long n) throws Exception
    {
        if(n < 0) throw new Exception("Value cannot be less than 0");
        long result = 1;
        for(int i = 1; i<=n; i++)
        {
            result *= i;
        }

        return result;
    }
}
