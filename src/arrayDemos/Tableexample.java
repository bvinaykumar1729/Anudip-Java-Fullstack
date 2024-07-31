package arrayDemos;
import java.util.Scanner;
public class Tableexample {
	
		public static void main(String[] args) {
			// Declare of table having 3 rows and 5 colmns
			int table[][];
			//initialize the number of rows and colmns 
			table = new int[3][5];
			//index variables for row and col.
			int row, col;
			//creating object of scanner.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number for a table havig 3 row annd 5 columns :");
			for(row=0;row<3;row++)
			{
				for(col=0;col<5;col++)
				{
					table[row][col] = sc.nextInt();
				}
			}
			System.out.println("Elements of table : ");
			for(row=0;row<3;row++)
			{
				for(col=0;col<5;col++)
				{
					System.out.print(table[row][col]+"\t");
				}
				// change line for next row
				System.out.println();
			}
			

		}

	}

