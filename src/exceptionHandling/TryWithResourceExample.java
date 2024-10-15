package exceptionHandling;
import java.util.Scanner;
public class TryWithResourceExample {

	public static void main(String[] args) {
		//creating object to Scanner class in try block
		try(Scanner sc = new Scanner(System.in)){
			//asking input through user 
			System.out.println("Enter first number:");
			int num1 = sc.nextInt();
			
			//asking input through user 
			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			
			//performing  division operation
			int result = num1/num2;
			System.out.println(" Result "+result);
		}

	}

}
