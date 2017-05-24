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
                        System.out.println("Wyniki obliczeń dla 8. wyrazu ciągu Fibonacciego:");
                        testFibonacci(8);
                        System.out.println("");

                        System.out.println("Wyniki obliczeń dla 45. wyrazu ciągu Fibonacciego:");
                        testFibonacci(45);
                        System.out.println("");

                        System.out.println("Wyniki obliczeń dla 50. wyrazu ciągu Fibonacciego:");
                        testFibonacci(50);
                        System.out.println("");

                        System.out.println("Wyniki obliczeń dla -2. wyrazu ciągu Fibonacciego:");
                        testFibonacci(-2);
                        System.out.println("");

                        System.out.println("Wyniki obliczeń dla silni liczby 5:");
                        testSilnia(5);
                        System.out.println("");

                        System.out.println("Wyniki obliczeń dla silni liczby 60:");
                        testSilnia(60);
                        System.out.println("");

                        System.out.println("Wyniki obliczeń dla silni liczby -3:");
                        testSilnia(-3);
                        System.out.println("");


                }
                
         private static void testFibonacci(int n)
         {
                   boolean exceptionA = false;
                   boolean exceptionB = false;
                   boolean exceptionC = false;
                   BigInteger resultA = new BigInteger("0");
                   BigInteger resultB = new BigInteger("0");
                   BigInteger resultC = new BigInteger("0");
             
                    try
                    {
                        resultA = new BigInteger(FibonacciPiotrMakowiec.Fib(new Long(n))+"");
                        System.out.println("Metoda FibonacciPiotrMakowiec.Fib() zwróciła wynik " + resultA.toString() );
                    } catch (Exception ex) {
                       System.out.println("Metoda FibonacciPiotrMakowiec.Fib() rzuciła wyjątek.");
                       exceptionA = true;
                    }
                    try
                    {
                        resultB = new BigInteger(TKrzywonosFibonacci.fibonacci(n)+"");
                         System.out.println("Metoda TKrzywonosFibonacci.fibonacci() zwróciła wynik " + resultB.toString() );
                    } catch (Exception ex) {
                        System.out.println("Metoda TKrzywonosFibonacci.fibonacci() rzuciła wyjątek.");
                        exceptionB = true;
                    }
                    try
                    {
                        resultC = FibonacciJeremiaszCzaja.fibonacci(n);
                         System.out.println("Metoda FibonacciJeremiaszCzaja.fibonacci() zwróciła wynik " + resultC.toString() );
                    } catch (Exception ex) {
                        System.out.println("Metoda FibonacciJeremiaszCzaja.fibonacci() rzuciła wyjątek.");
                        exceptionC = true;
                    }

                    if (!exceptionA && !exceptionB && !exceptionC)
                    {
                       if(resultA.equals(resultB))
                       {
                             System.out.println("Wynik po głosowaniu to " + resultA.toString());
                       }
                       else
                       {
                             if(resultB.equals(resultC))
                            {
                                  System.out.println("Wynik po głosowaniu to " + resultB.toString());
                            }
                             else
                             {
                                 if(resultA.equals(resultC))
                                 {
                                       System.out.println("Wynik po głosowaniu to " + resultA.toString());
                                 }
                                 else
                                 {
                                     System.out.println("Żadna opcja nie zdobyła wystarczającej ilości głosów. ");
                                 }
                             }
                       }
                    }
                    else
                    {
                        System.out.println("Pojawiły się błędy, nie można okreslić wyniku.");
                    }
                    
                    
         }
         
         private static void testSilnia(int n)
         {
                   boolean exceptionA = false;
                   boolean exceptionB = false;
                   BigInteger resultA = new BigInteger("0");
                   BigInteger resultB = new BigInteger("0");
                   BigInteger resultC = new BigInteger("0");
                   
             
                    try
                    {
                        resultA = new BigInteger(SilniaPiotrMakowiec.ObliczIteracyjnie(new Long(n))+"");
                        System.out.println("Metoda SilniaPiotrMakowiec.ObliczIteracyjnie() zwróciła wynik " + resultA.toString() );
                    } catch (Exception ex) {
                         System.out.println("Metoda SilniaPiotrMakowiec.ObliczIteracyjnie() rzuciła wyjątek.");
                         exceptionA = true;
                    }
                    try
                    {
                        resultB = new BigInteger((long)TKrzywonosStrong.calculateStrong(n)+"");
                        System.out.println("Metoda TKrzywonosStrong.calculateStrong() zwróciła wynik " + resultB.toString() );
                    } catch (Exception ex) {
                        System.out.println("Metoda TKrzywonosStrong.calculateStrong() rzuciła wyjątek.");
                        exceptionB = true;
                    }
                    
                  resultC = SilniaJeremiaszCzaja.silnia(n);
                  System.out.println("Metoda SilniaJeremiaszCzaja.silnia() zwróciła wynik " + resultC.toString() );
                  
                  if (!exceptionA && !exceptionB)
                  {
                      if(resultA.equals(resultB))
                      {
                            System.out.println("Wynik po głosowaniu to " + resultA.toString());
                      }
                      else
                      {
                            if(resultB.equals(resultC))
                           {
                                 System.out.println("Wynik po głosowaniu to " + resultB.toString());
                           }
                            else
                            {
                                if(resultA.equals(resultC))
                                {
                                      System.out.println("Wynik po głosowaniu to " + resultA.toString());
                                }
                                else
                                {
                                    System.out.println("Żadna opcja nie zdobyła wystarczającej ilości głosów. ");
                                }
                            }
                      }
                  }
                  else
                   {
                       System.out.println("Pojawiły się błędy, nie można okreslić wyniku.");
                   }
         }
                

}
