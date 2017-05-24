package fibonacci;

/**
 * Created by piotr on 5/23/2017.
 */
public class FibonacciPiotrMakowiec
{
    /***
     * Static function which calculate n element of Fibonacci
     * @param n - n element we wanna calculate
     * @return calculated n element of Fibonacci
     */
    public static Long Fib(Long n) throws Exception
    {
        if(n < 0) throw new Exception("Cannot calculate when input is less than 0");
        if(n == 0) return Long.valueOf(1);

        if((n == 1)||(n == 2))
        {
            return Long.valueOf(1);
        }
        else
        {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
}
