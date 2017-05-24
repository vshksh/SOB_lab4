package silnia;

public class TKrzywonosStrong {
	
	public static double calculateStrong(double value) throws Exception{
		double result = 1;
		//System.out.print("silnia dla wartosci " + value);
		long startTime = System.nanoTime();

		if (value < 0) throw new Exception ("liczba jest mniejsza od zera");

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
