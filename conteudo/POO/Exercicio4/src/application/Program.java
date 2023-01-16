package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = s.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double xy = s.nextDouble();
		
		double result = CurrencyConverter.converter(dollar, xy);
		
		System.out.printf("Amount to be paud in reais = %.2f%n", result);
		
		s.close();
	}
}
