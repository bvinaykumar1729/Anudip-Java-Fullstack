package oppsConcepts;
import java.util.Scanner;

// Defining  a class for circle
 class Circle{
	 // Member variable
	 private float radius;
	 private final float pi=3.14f;
	 // --------------------------------------------------------------------
	 //Input of data through user
	 public void inputRadius() {
		 //  Creating object for Scanner class
		 Scanner sc = new Scanner(System.in);
		 // Input of data through keyboard
		 System.out.println("Enter Radius of Circle(in cm) : ");
		 radius = sc.nextFloat();
	 }
	 // --------------------------------------------------------------------
	 // Method to displaying data
	 public void displayRadius() {
		 System.out.println("------------------------------");
		 System.out.println("-----Radius------");
		 System.out.println("Radius : "+radius+" cm");
		 
	 }
	 // ---------------------------------------------------------------------
	 // Method for calculate perimeter
	 public void calculatePerimeter() {
		 
		 float perimter; // variable to store perimter
		 perimter= 2*pi*radius;
		 System.out.println("Perimeter "+perimter+" cm ");
		 
		 
	 }
	 //---------------------------------------------------------------------
	 // Method to calculate area
	 public void calculateArea() {
		 float area; // variable to store area
		 area = pi*radius*radius;
		 System.out.println("Area "+area+" cm");
	 }
	 
 }
public class CircleOperation {

	public static void main(String[] args) {
		
		//  creating object to Circle class
		Circle circleOne = new Circle();
		//  method for input of radius
		circleOne.inputRadius();
		//  method to display radius of circle
		circleOne.displayRadius();
		//  method of perimeter
		circleOne.calculatePerimeter();
		//  method of area
		circleOne.calculateArea();
		

	}

}
