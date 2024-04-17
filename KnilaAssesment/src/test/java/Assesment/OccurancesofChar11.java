package Assesment;

import java.util.HashMap;
import java.util.Map;

public class OccurancesofChar11 {

	public static void main(String[] args) {

		// Given input string
		String str = "google";

		// Convert the string to a character array
		char[] charArray = str.toCharArray();

		// Create a HashMap to store the count of each character
		Map<Character, Integer> charCount = new HashMap<>();

		// Iterate through each character in the array
		for (char c : charArray) {
			// Check if the character is already present in the HashMap
			if (charCount.containsKey(c)) {
				// If yes, increment the count
				charCount.put(c, charCount.get(c) + 1);
			} else {
				// If not, add the character to the HashMap with count 1
				charCount.put(c, 1);
			}
		}

		// Iterate through the entries in the HashMap
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			char character = entry.getKey();
			int occurrences = entry.getValue();

			// Print the character and its occurrences
			System.out.println("Character: " + character + ", Occurrences: " + occurrences);
		}
	}
}
