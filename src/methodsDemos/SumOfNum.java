package methodsDemos;
import java.util.Scanner;
public class SumOfNum {

	public static void main(String[] args) {
		// WAP sum of two numbers method check sum is positive or not
		
		//creating variables to two numbers
		int firstNumber,secondNumber;
		
		//creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		secondNumber = sc.nextInt();
		
		//calling method 
		int sum =SumOfTwoNumbers( firstNumber,secondNumber);
		//sum of two numbers
		System.out.println("Sum of "+firstNumber+" and" +secondNumber+" is : "+sum);
		//calling method checkPostiveNot
		checkPostiveorNot(sum);

	}
 public static int SumOfTwoNumbers(int firstNumber,int secondNumber) {
	 int sum =firstNumber+secondNumber;
	 return sum;
 }
 public static void checkPostiveorNot(int sum) {
	 if(sum>0) {
		 System.out.println("Positive");
	 }
	 else {
		 System.out.println("Negative ");
	 }
 }
}
