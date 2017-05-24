package fibonacci;

public class TKrzywonosFibonacci {
	
	  public static int fibonacci(int number) throws Exception {
                                                         if(number<0) throw new Exception();
			if ((number == 0) || (number == 1))  return number;
			else return fibonacci(number - 1) + fibonacci(number - 2);
	  }
	  
	  public static void printFibonacci(int maxValue) throws Exception {
		  int result = 0;

		  long startTime = System.nanoTime();
	      for (int i = 0; i <= maxValue; i++) {
	    	  result = fibonacci(i);
	      }
	      System.out.println("wynik ciagu fibonacciego dla wartosci " + maxValue + " wynosi " + result);
	      long stopTime = System.nanoTime();
	      System.out.println("czas obliczen w nanosekundach: " + (stopTime - startTime));
	  }
}