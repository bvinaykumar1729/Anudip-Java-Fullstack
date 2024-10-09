package dataTypesDemo;
import java.util.Scanner;
public class DivisibleNumbers {

	public static void main(String[] args) {
		//Creating an object to Scanner class
		Scanner sc = new Scanner(System.in);
//		Asking user to input enter first number
		System.out.println("Enter first number");
		//taking input  through user 
		int number1 =sc.nextInt();
		//Asking user to input enter second number
		System.out.println("Enter second number");
		//taking input  through user 
		int number2 =sc.nextInt();
		//Checking divisability number1 to number2
		
		if(number2>0) {
			
		if(number1%number2==0) {
			System.out.println("Number1 is divisible by number2");
		}
		}
		else if(number2<0) {
			System.out.println("Enter a valid number");
		}
	}

}
