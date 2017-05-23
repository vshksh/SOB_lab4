package sob_lab4;

public class TKrzywonosFibonacci {
	
	  private static int fibonacci(int number) {
			if ((number == 0) || (number == 1))  return number;
			else return fibonacci(number - 1) + fibonacci(number - 2);
	  }
	  
	  public static void printFibonacci(int maxValue) {
		  int result = 0;
		  try {
			  if (maxValue < 0) throw new Exception ("liczba jest mniejsza od zera");
		  } catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		  long startTime = System.nanoTime();
	      for (int i = 0; i <= maxValue; i++) {
	    	  result = fibonacci(i);
	      }
	      System.out.println("wynik ciagu fibonacciego dla wartosci " + maxValue + " wynosi " + result);
	      long stopTime = System.nanoTime();
	      System.out.println("czas obliczen w nanosekundach: " + (stopTime - startTime));
	  }
}