package objectOriented06.utility;

public class Converter {
	public static final double IOF = 0.06;
	
	public static double valueDollar(double valueDollar, double amount) {
		return amount * valueDollar * (1 + IOF);
	}
		
}
