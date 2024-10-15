package exceptionHandling;

import java.util.Scanner;

/*-------Creating custom exception for Radius------*/
class RadiusException extends Exception {

	/*----------Constructor----------------*/
	public RadiusException(String msg) {
		super(msg);
	}
}

/*-----------------Circle class definition-----------------*/
class Circle {
	// member variable
	static final double PI = 3.14;
	double radius;
	double area;
	double perimeter;

	// method for area calculate of circle
	public void calcualateAreaOfCircle(double radius) {
		this.radius = radius;

		this.area = PI * (radius * radius);
		System.out.println("Area of Circle is : " + area);
	}

	//method for perimeter calculate of circle
	public void calculatePerimeterOfCircle(double radius) {
		this.radius = radius;

		this.perimeter = 2 * PI * radius;
		System.out.println("Perimeter of circle is : " + perimeter);

	}
}

public class CircleOperation  {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter radius of circle :");
			double radius = sc.nextDouble();
			if (radius <= 0) {
				throw new RadiusException("\n Radius can't be negative \n Please Enter Valid Radius value \n");

			}
             //Object of Circle class
			Circle circle = new Circle();
			circle.calcualateAreaOfCircle(radius);
			circle.calculatePerimeterOfCircle(radius);

		} catch (RadiusException exceptionObject) {
			System.err.println(exceptionObject.getMessage());
		}

	}

}
