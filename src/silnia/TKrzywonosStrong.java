package silnia;

public class TKrzywonosStrong {
	
	public static void calculateStrong(double value){
		double result = 1;
		//System.out.print("silnia dla wartosci " + value);
		long startTime = System.nanoTime();
		  try {
			  if (value < 0) throw new Exception ("liczba jest mniejsza od zera");
		  } catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		if (value >= 0) {
			while (value > 0) {
				result *= value;
				value--;
			}
			//System.out.println(" wynosi "+ result);
			long stopTime = System.nanoTime();
			 //System.out.println("czas obliczen w nanosekundach: " + (stopTime - startTime));
			 
		}
		return result;
	}
}
