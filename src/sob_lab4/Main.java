package sob_lab4;

import fibonacci.FibonacciJeremiaszCzaja;
import silnia.TKrzywonosStrong;
import fibonacci.TKrzywonosFibonacci;

public class Main {

                public static void main(String[] args)
                {
                        TKrzywonosFibonacci.printFibonacci(15);
                        TKrzywonosStrong.calculateStrong(15);
                        System.out.println("Czaja");
                        System.out.println(FibonacciJeremiaszCzaja.fibonacci(12));

                }

}
