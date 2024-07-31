package arrayDemos;
import java.util.Scanner;
public class ArrayDemo2 {

	public static void main(String[] args) {
//		write create an array of 10 given through keyboard print them
		
		int i,j;
		int size;
		
//		create object of Scanner class
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of array:");
		size=sc.nextInt();
		
//		declaring and initializing an array with size variable
		int[] arr =new int[size];
		
//		taking input from user
		System.out.println("Enter numbers");
		for(i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
//		printing array elements using for loop
		System.out.print("Array elements are :");
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x]+",");
		}
		
//		Display only Even numbers only
		System.out.println();
		System.out.print("Even numbers :");
		for(j=0; j<arr.length; j++) {
			if(arr[j]%2==0) {
			System.out.print(arr[j]+",");
			}
			
		}

	}

}
