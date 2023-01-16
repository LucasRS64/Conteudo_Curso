package entities;

public class Rectangle {

	public double a;
	public double b;
	
	
	public double area() {
		double p = a * b;
		return p;
	}
	
	public double perimeter() {
		double x = (a * 2) + (b * 2);
		return x;
		
	}
	public double diagonal() {
		double y = (a*a) + (b*b);
		double result = Math.sqrt(y);
		
		return result;
	}
}
