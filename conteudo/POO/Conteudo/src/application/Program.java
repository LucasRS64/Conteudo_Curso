package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = s.nextDouble();
		x.b = s.nextDouble();
		x.c = s.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = s.nextDouble();
		y.b = s.nextDouble();
		y.c = s.nextDouble();

		
		double areaX = x.area();	
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.print("Larger area: X"); 
		}
		else {
			System.out.print("Larger area: Y");
		}
		
		s.close();	
	}

}
