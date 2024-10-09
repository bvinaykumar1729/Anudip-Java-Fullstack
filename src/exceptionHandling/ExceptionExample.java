package exceptionHandling;
import java.util.Scanner;
public class ExceptionExample {

	public static void main(String[] args) {
		int num1,num2;
//------Object of Scanner class----------
		Scanner sc = new Scanner(System.in);
		//-----input of data through keyboard------
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		System.out.println("-------------------------------");
		try {
			System.out.println("On Dividing "+num1+" by "+num2+" : ");
			System.out.println("Quotient : "+(num1/num2));
			System.out.println("Remainder :"+(num1%num2));
			System.out.println("----------------------------");
		}catch(Exception  obj) {
			System.err.println("Unable to divide by number 0 : "+obj);
			
		}
		System.out.println("------------Task completed----------");
	}

}
