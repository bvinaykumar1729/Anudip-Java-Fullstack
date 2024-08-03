package labprgms4;
import java.util.Scanner;

//define a class to check number Armstrong or not
 class ArmstrongNumber{
	 
	 // creating member variables to store numbers
	 int number,reminder,sum,originalNumber;
	 
	 // a method taking input through user
	public void  inputNumber() {
		
		// creating object to Scanner class
	 Scanner sc = new Scanner(System.in);
	 
	 //  taking input through keyboard
	 System.out.println("Enter a number");
	 number = sc.nextInt();
	 originalNumber = number;
	 
	 }
	
	// a method to check given number Armstrong number
	public void armstrongNumber() {
		while(number!=0) {
			reminder=number%10;
			sum+=reminder*reminder*reminder;
			number=number/10;
			
		}
		if(sum==originalNumber) {
			System.out.println(originalNumber+" is Armstrong Number");
			
		}
		else {
			System.out.println(originalNumber+" is Not an Armstrong Number");
		}
	}
	 
 }
public class ArmstrongNumberOperation {

	public static void main(String[] args) {
		// creating object to ArmstrongNumber class
		ArmstrongNumber armNumber = new ArmstrongNumber();
		// method of input
		armNumber.inputNumber();
		// method of checking ArmstrongNumber
		armNumber.armstrongNumber();

	}

}
