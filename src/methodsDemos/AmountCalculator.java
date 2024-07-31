package methodsDemos;
import java.util.Scanner;
public class AmountCalculator {
//  method to calculate simple interest
	
	public static float calculateSimpleInterest(float principal,float rate,int time) {
		float si;
		// calculating simple interest
		si=(principal*rate*time)/100;
		// returning simple interest
		return si;
	}
	//----------------------------------
	public static void main(String[] args) {
		
		
		// creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		//variables to store principal,rate and time
		float principal ,rate;
		int time;
		// Input from keyboard
		System.out.println("Enter principal(in Rs):");
		principal = sc.nextFloat();
		System.out.println("Enter rate(in %):");
		rate = sc.nextFloat();
		System.out.println("Enter time(in year):");
		time = sc.nextInt();
		//---------------------------------
		// Calculate simple interest
		float interest = calculateSimpleInterest(principal,rate,time);
		// to calculate amount
		float amount =principal+interest;
		System.out.println("--------------------------------------");
		System.out.println("Amount to be paid after charging simple interest: Rs "+amount);
		
	}

}
