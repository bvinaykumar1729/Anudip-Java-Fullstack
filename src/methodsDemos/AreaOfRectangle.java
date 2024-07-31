package methodsDemos;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		// WAP to find perimeter and area of rectangle
		float length,width;
		//creating object for Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		length=sc.nextInt();
		
		
		System.out.println("Enter width of rectangle");
		width =sc.nextInt();
		
		System.out.println("Length of rectangle is :"+length);
		System.out.println("--------------------------------");
		System.out.println("Width of rectangle is :"+width);
		System.out.println("--------------------------------");
		
		//calling area method
		area(length,width);
		System.out.println("--------------------------------");
		//calling perimeter method
		perimeter(length,width);

	}

	//Declaring and Define area method here below
	public static void area(float length,float width) {
		//calculating area
		float areaOfRec = length*width;
		System.out.println("Area of Rectangle is :"+areaOfRec);
	}
	
	//Declaring and Define perimeter method here below
	public static void perimeter(float length,float width) {
		//calculating perimeter
		float perimeterOfRec = 2*(length+width);
		System.out.println("Perimeter of Rectangle is :"+perimeterOfRec);
	}
}
