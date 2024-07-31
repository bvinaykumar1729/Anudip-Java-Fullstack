package arrayDemos;
import java.util.Scanner;
public class AverageOfEleArr {

	public static void main(String[] args) {
		// Write a program to create an array of any 15 number and print the average of all the numbers
		
				int i,j;
				int size,num;
				float average=0,sum=0;
				
//				create object of Scanner class
				Scanner sc =new Scanner(System.in);
				System.out.print("Enter total number of array:");
				size=sc.nextInt();
				
//				declaring and initializing an array with size variable
				int[] number =new int[size];
				num=number.length;
//				taking input from user
				System.out.println("Enter numbers");
				for(i=0; i<number.length; i++) {
					number[i]=sc.nextInt();
				}
				
//				printing array elements using for loop
				System.out.print("Array elements are :");
				for(int x=0; x<number.length; x++) {
					System.out.print(number[x]+",");
				}
				
//				Display Average of array numbers 
				System.out.println();
				System.out.print("Average of array numbers is :");
				for( j=0; j<number.length; j++) {
					sum+=number[j];
					
				}
				// calculating average of numbers
				average=sum/num;
				System.out.println(average);
				}

	}


