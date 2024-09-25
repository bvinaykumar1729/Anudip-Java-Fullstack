package stringDemos;
import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a sentence:");
		        String sentence = scanner.nextLine();
		        
		        int uppercaseCount = 0;
		        int lowercaseCount = 0;
		        
		        for (int i = 0; i < sentence.length(); i++) {
		            char ch = sentence.charAt(i);
		            if (Character.isUpperCase(ch)) {
		                uppercaseCount++;
		            } else if (Character.isLowerCase(ch)) {
		                lowercaseCount++;
		            }
		        }
		        
		        System.out.println("Number of uppercase characters: " + uppercaseCount);
		        System.out.println("Number of lowercase characters: " + lowercaseCount);
		    }
	}


