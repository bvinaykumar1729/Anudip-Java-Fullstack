package labprgms3;
import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// Bigger of among three numbers
	
//			declaring three variables integer type a,b,c initialized values
				int num1,num2,num3;
				
				//creating object for Scanner class
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter any three numbers");
				//taking input as a number from the user
				num1=sc.nextInt();
				num2=sc.nextInt();
				num3=sc.nextInt();
				//comparing values by using nested if else condition
				if(num1>num2) {
					if(num1>num3) {
						System.out.println(num1+" is Largest");
					}
					else {
						System.out.println(num3+" is Largest");
					}
				}
				else {
					if(num2>num3) {
						System.out.println(num2+" is Largest");
					}
					else {
						System.out.print(num3+" is Largest");
					}
				}

			}
	}
