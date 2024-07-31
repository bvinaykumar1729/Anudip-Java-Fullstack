package arrayDemos;
import java.util.Scanner;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// WAP to find the maximum marks in list of student
		
				int lengthOfArr;
//				create object of Scanner class
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter number of students:");
				lengthOfArr=sc.nextInt();
				//declaration of array
				int[] stuMarks = new int[lengthOfArr];
				
//				asking to user enter input values to that number in array
				System.out.println("Enter marks of students:");
				for(int index=0; index<stuMarks.length; index++) {
					stuMarks[index]=sc.nextInt();
					
				}
				System.out.print("Student marks are :");
				for(int ind=0; ind<stuMarks.length; ind++) {
					System.out.print(stuMarks[ind]+",");
				}
				
//				method call of maxMarks
				maxMarks(stuMarks);
			}
			
			// method declaration and definition of maxMarksr
			public static void maxMarks(int[] stuMarks) {
				
				//declaring variables to store index of array
				int  maxMarks=0,currentIndex=0; int nextIndex=1;
				//while loop created to compare array elements to the at end of index of array
				while(nextIndex<stuMarks.length) {
					
					// comparing array elements with help of if else statement
					if(stuMarks[currentIndex]<stuMarks[nextIndex]) {
						stuMarks[currentIndex]=stuMarks[nextIndex];
						maxMarks=stuMarks[currentIndex];
						
					}
					else {
						maxMarks=stuMarks[currentIndex];
						
					}
					nextIndex++;
					   }
				
					System.out.println();
					//printing maxMarks
				System.out.println("Highest marks are: "+maxMarks);
			}

	}


