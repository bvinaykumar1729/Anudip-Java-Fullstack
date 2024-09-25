package stringDemos;
import java.util.Scanner;
public class CombingTwoStrings {

	public static void main(String[] args) {
		//Asking input for user enter a sentence
		System.out.println("Enter any Sentence");
		Scanner sc = new Scanner(System.in);
		//taking input through user as String one
		String inputOne = sc.nextLine();
		System.out.println("Enter any Sentence");
		//taking input through user as String Two
		String inputTwo =sc.nextLine();
		//Combing two String into as a One String
		String combinString = inputOne+inputTwo;
		//Printing String one,two and, combined String
		System.out.println("String one : "+inputOne);
		System.out.println("String two :"+inputTwo);
		System.out.println(combinString);
	}
}