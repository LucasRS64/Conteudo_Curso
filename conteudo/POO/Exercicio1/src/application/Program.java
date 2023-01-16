package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Rectangle f = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		f.a = s.nextDouble();
		f.b = s.nextDouble();
		
		double area = f.area();
		double perimeter = f.perimeter();
		double diagonal = f.diagonal();
		
		
		System.out.printf("AREA = " + String.format("%.2f%n", area));	
		System.out.printf("PERIMETER = " + String.format("%.2f%n", perimeter));
		System.out.printf("DIAGONAL = " + String.format("%.2f%n", diagonal));
		
		s.close();
	}
}
