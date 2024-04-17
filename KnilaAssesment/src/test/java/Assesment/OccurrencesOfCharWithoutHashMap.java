package Assesment;

public class OccurrencesOfCharWithoutHashMap {

	public static void main(String[] args) {
		// Given input string
		String str = "google";

		// Convert the string to a character array
		char[] charArray = str.toCharArray();

		// Assuming ASCII characters (total 256 characters)
		int[] charCount = new int[256];

		// Iterate through each character in the array
		for (char c : charArray) {
			// Increment the count of the corresponding character in the array
			charCount[c]++;
		}

		// Iterate through the array to print occurrences
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				// Convert the ASCII value to char for display
				char character = (char) i;
				int occurrences = charCount[i];

				//if(charCount[i]==1)
				// Print the character and its occurrences
				System.out.println("Character: " + character + ", Occurrences: " + occurrences);
			}
		}
	}
}


