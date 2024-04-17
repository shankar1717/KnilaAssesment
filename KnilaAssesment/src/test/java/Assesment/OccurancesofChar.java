package Assesment;

import java.util.HashMap;
import java.util.Map;

public class OccurancesofChar  {

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

			// Print characters with count 1
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
