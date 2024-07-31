package methodsDemos;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		// check it odd or even 
		
		//created object for Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		// taking input through user
		int number = sc.nextInt();
		
		//calling method checkOddOrEven passing one parameter integer type
		checkOddOrEven(number);

	}
	
	//declared and defined checkOddOrEven function with one parameter number
	public static void checkOddOrEven(int number) {
		
		//checking here entered number is even or odd using if and else
		if(number%2==0)
		{
			System.out.println(number+"is even number :");
		}
		else{
			System.out.println(number+"is odd number :");
		}
	}

}
