package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.print("Name: ");
		x.name = s.nextLine();
		System.out.print("Gross salary: ");
		x.salary = s.nextDouble();
		System.out.print("Tax: ");
		x.tax = s.nextDouble();
		
		System.out.println("Employee: " + x);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = s.nextDouble();
		x.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + x);
		s.close();
		
		
		
		
	}
}
