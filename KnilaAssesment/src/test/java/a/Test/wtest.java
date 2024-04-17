package a.Test;


public class wtest {
	public static void wordPrinter(String[] s) {
		// Declares a method named wordPrinter that takes an array of strings as input.

		if (s.length != 0) { // Checks if the input string array is not empty.
		
			for (String w : s) { // Iterates over each string in the input array.
			
				String[] words = w.split("\\s+"); // Splits the string into an array of words based on whitespace.
				
			//	for (String word : words) { // Iterates over each word in the array.
				for (int i = 0; i < words.length; i++) {
					
			
					System.out.println(words[i]); // Prints each word to the console.
				}
				System.out.println(); // Prints a blank line after printing all words in a string.
			}
		} else { // Executes if the input string array is empty.
			
			System.out.println("Input string array is empty"); // Prints that the input array is empty.
		}
	}

	public static void main(String[] args) { // Declares the main method, the entry point of the program.
		
		String[] s = { "This is a  test", "The car is on ", "i am   Running" }; // Declares an array of strings.
		
		wordPrinter(s); // Calls the wordPrinter method with the input string array.
	}
}
