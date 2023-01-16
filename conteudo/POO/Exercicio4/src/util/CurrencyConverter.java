package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dollar, double xy) {
		return dollar * xy + (dollar * xy * IOF);
	}
	
}
