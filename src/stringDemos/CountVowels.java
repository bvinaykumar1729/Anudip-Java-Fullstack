package stringDemos;
import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		
		        // Initialize a counter for vowels
		        int vowelCount = 0;
		        
		        // Define a string containing all vowels
		        String vowels = "aeiou";

		        // Create a Scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a sentence:");
		        
		        // Read the input sentence
		        String sentence = scanner.nextLine();

		        // Convert the sentence to lowercase to handle case insensitivity
		        sentence = sentence.toLowerCase();

		        // Iterate through each character in the sentence
		        for (int i = 0; i < sentence.length(); i++) {
		            char ch = sentence.charAt(i);

		            // Check if the character is a vowel
		            if (vowels.indexOf(ch) != -1) {
		                // Increment the vowel count if a vowel is found
		                vowelCount++;
		            }
		        }

		        // Output the total number of vowels in the sentence
		        System.out.println("Number of vowels in the given sentence: " + vowelCount);
		    }

	}

