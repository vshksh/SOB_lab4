package sob_lab4;

import fibonacci.FibonacciJeremiaszCzaja;
import fibonacci.FibonacciPiotrMakowiec;
import silnia.TKrzywonosStrong;
import fibonacci.TKrzywonosFibonacci;
import java.math.BigInteger;
import silnia.SilniaJeremiaszCzaja;
import silnia.SilniaPiotrMakowiec;

public class Main {

                public static void main(String[] args)
                {
                        TKrzywonosFibonacci.printFibonacci(15);
                        TKrzywonosStrong.calculateStrong(1500);
                        System.out.println("Czaja");
                        System.out.println(FibonacciJeremiaszCzaja.fibonacci(12));
                        System.out.println(SilniaJeremiaszCzaja.silnia(14));

                }
                
         private void testFibonacci(int n) throws Exception
         {
                  BigInteger resultA = new BigInteger(FibonacciPiotrMakowiec.Fib(new Long(n))+"");
                  BigInteger resultB = new BigInteger(TKrzywonosFibonacci.fibonacci(n)+"");
                  BigInteger resultC = FibonacciJeremiaszCzaja.fibonacci(n);
         }
         
         private void testSilnia(int n) throws Exception
         {
                  BigInteger resultA = new BigInteger(SilniaPiotrMakowiec.ObliczRekurencyjnie(new Long(n))+"");
                  BigInteger resultB = new BigInteger(TKrzywonosStrong.calculateStrong(n)+"");
                  BigInteger resultC = SilniaJeremiaszCzaja.silnia(n);
         }
                

}
