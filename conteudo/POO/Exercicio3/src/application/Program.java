package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Student x = new Student();
		
		
		System.out.print("Student name: ");
		x.name = s.nextLine();
		x.note1 = s.nextDouble();
		x.note2 = s.nextDouble();
		x.note3 = s.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", x.finalGrade());
		
		if (x.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING POINTS %.2f%n", x.missingPoints());
		}
		else {
			System.out.println("PASS");
			
		}
			
		s.close();

	}

}
