package stringDemos;

/**
 * This program counts the number of special characters in a given sentence. A
 * special character is defined as any character that is not a letter (a-z or
 * A-Z) or a digit (0-9).
 */

public class SpecialCharacterCounter {

	/**
	 * This method counts the number of special characters in a given sentence.
	 * 
	 * @param sentence The input sentence to count special characters from.
	 * @return The total number of special characters in the sentence.
	 */
	public static int countSpecialChars(String sentence) {
		int specialCharCount = 0; // Initialize a counter variable to store the count of special characters.

		// Convert the sentence to a character array for efficient iteration.
		for (char c : sentence.toCharArray()) {
			// Check if the current character is a special character.
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				specialCharCount++; // Increment the special character count if the character is a special
				// character.
			}
		}

		return specialCharCount; // Return the final special character count.
	}

	/**
	 * Main method to test the countSpecialChars method.
	 * 
	 * @param args Command-line arguments (not used in this program).
	 */
	public static void main(String[] args) {
		String sentence = "Hello, World! @#$"; // Example sentence with special characters.
		int specialCharCount = countSpecialChars(sentence);

		System.out.println("Number of special characters: " + specialCharCount); // Output: 5
	}
}
