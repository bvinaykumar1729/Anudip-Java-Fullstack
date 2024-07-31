package loopsDemo;
import java.util.Scanner;
public class TableDemo {

	public static void main(String[] args) {
		// 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number");
				int num=sc.nextInt();
				int pos;
				for(pos=1 ; pos< 20 ; pos++ ) {
					System.out.println(num +" * " +pos+" = "+(num*pos));
				}
				

			}
	}

