package labprgms4;
import java.util.Scanner;

//creating class for prime number
 class PrimeNumber{
	 
	 //creating member variables to store number
	 int range,number,divisor;
	 
	 //--------------------------------------
	 public void input() {
		 //creating an object for Scanner class
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter range of the number");
		 range =sc.nextInt();	 
	 }
	 
	 //--------------------------------------
	 // method to generate prime number series
	 public void primeNumberOperation() {
		 
		 System.out.print("Prime number series are :");
		 // outer loop for certain range of numbers
		 for(int i=1; i<=range; i++) {
			 int divisor =0;
			 // inner loop for to find divisors of that numbers
			 for(int j=1; j<=i; j++) {
				 if(i%j==0) {
					 divisor++; 
				 }
			 }
			 if(divisor==2) {
				 System.out.print(i+",");
				 
			 }
		 }
	 }
 }
 //--------------------------------------
 // main class 
public class PrimeSeries {

	public static void main(String[] args) {
		// creating object for PrimeSeries class
		PrimeNumber prime = new PrimeNumber();
		// a method for input
		prime.input();
		// a method for prime number series
		prime.primeNumberOperation();

	}

}
