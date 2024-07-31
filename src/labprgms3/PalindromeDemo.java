package labprgms3;
import java.util.Scanner;
public class PalindromeDemo {

	public static void main(String[] args) {
		//check number is palindrome or not
		
		int rem,originalNum,reverseNum=0;
//		creating object to Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
//	giving input through user
		int number = sc.nextInt();
		 originalNum =number;
		 
		 //Applying while loop for reversing the given number
		while(number!=0) {
			
			//Extract the last digit
			rem=number%10;
			
			//Append the digit to the reversed number
			reverseNum=(reverseNum*10)+rem;
			
			//Remove the last digit from the original
			number=number/10;
		}
		
		//to check if the given number is Palindrome or not
		if(reverseNum == originalNum) {
			System.out.println("Number is Palindrome");
			
		}
		else {
			System.out.println("Number is not a Palindrome");
		}

	}

}
