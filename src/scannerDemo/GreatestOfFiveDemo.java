package scannerDemo;
import java.util.Scanner;
public class GreatestOfFiveDemo {
	
	public static void main(String[] args) {
		//declared five variables to store five numbers
		int num1,num2,num3,num4,num5;
		
		//creating object to Scanner class
					Scanner sc=new Scanner(System.in);
					
					//taking input through keyboard
					System.out.println("Enter first Number");
					num1=sc.nextInt();
					System.out.println("Enter Second Number");
					num2=sc.nextInt();
					System.out.println("Enter Third Number");
					num3=sc.nextInt();
					System.out.println("Enter Fourth Number");
					num4=sc.nextInt();
					System.out.println("Enter Fifth Number");
					num5=sc.nextInt();
					
	//comparing numbers which is greatest among five with if else statement
				if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
					System.out.println("num1 is greater");
				}
				else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
					System.out.println("num2 is greater");
				}
				else if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
					System.out.println("num3 is greater");
				}
				else if(num4>num1 && num4>num2 && num4>num3 &&num4>num5) {
					System.out.println("num4 is greater");
				}
				else if(num1==num2&&num2==num3&&num4==num5){
					System.out.println("All number are equal ");
				}
				else {
					System.out.println("num5 is greater");
				}
			}
	}

