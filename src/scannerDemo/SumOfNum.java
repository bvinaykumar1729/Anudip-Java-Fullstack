package scannerDemo;
import java.util.Scanner;
public class SumOfNum {

	public static void main(String[] args) {
		int size,i,j;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array:");
		size=sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter numbers");
		for( i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(j=0; j<arr.length; j++) {
			System.out.println("Index is :"+j+" "+arr[j]);
			sum+=arr[j];
		}
		System.out.println("sum of numbers is : "+sum);


}
}
