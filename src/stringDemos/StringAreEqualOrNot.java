package stringDemos;
import java.util.Scanner;
public class StringAreEqualOrNot {

	public static void main(String[] args) {
		//Asking user enter 
		System.out.println("Enter first String");
		Scanner sc = new Scanner(System.in);
		String inputOne =sc.nextLine();
		System.out.println("Enter second String");
		String inputTwo =sc.nextLine();
		if(inputOne.equals(inputTwo)) {
			System.out.println("Both Strings are Equal");
		}
		else {
			System.out.println("Both Strings are Not Equal");
		}

	}

}
