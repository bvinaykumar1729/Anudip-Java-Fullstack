package labprgms4;
import java.util.Scanner;

//define a class to check perfectNumber or not
class PerfectNumber{
	//------------------------------------------------
	//created member variables to store numbers
	int number,originalNumber,divisors,sum;
	
	//------------------------------------------------
	//taking input through user
	public void inputNumber() {
		//creating Object to Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking input through keyboard
		System.out.println("Enter a nummber");
		number = sc.nextInt();
		originalNumber = number;
	}
	
	//-------------------------------------------------
	//method to check given number perfectNumber or not
	public void checkPerfectNumber() {
		System.out.println("--------------------------");
		System.out.print("Divisors of "+number+" is :");
		//here taking for loop to find number of divisors
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				divisors=i;
				System.out.print(divisors+",");
				sum+=divisors;
			}
		}
		if(sum==originalNumber) {
			System.out.println("\n--------------------------");
			System.out.println(originalNumber+" is the Perfect Number");
		}
		else {
			System.out.println("\n--------------------------");
			System.out.println(originalNumber+" is not a Perfect number");
		}

	}
			
}

//--------------------------------------------------
public class PerfectNumberOperation {

	public static void main(String[] args) {
		PerfectNumber pfNumber = new PerfectNumber();
		// method of input
		pfNumber.inputNumber();
		// method for checkingPerfect number
		pfNumber.checkPerfectNumber();
		
		

	}

}
