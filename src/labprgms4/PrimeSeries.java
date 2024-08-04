package labprgms4;
import java.util.Scanner;

//creating class for prime number
 class PrimeNumber{
	 //creating member variables
	 int range,number,divisor;
	 public void input() {
		 //creating an object for Scanner class
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter range of the number");
		 range =sc.nextInt();	 
	 }
	 public void primeNumberOperation() {
		 System.out.print("Prime number series is :");
		 for(int i=1; i<=range; i++) {
			 int divisor =0;
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
public class PrimeSeries {

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		prime.input();
		prime.primeNumberOperation();

	}

}
