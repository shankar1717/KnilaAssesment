package Assesment;

public class LetterOccurrence {
 
 public static void main(String[] args) {
     
     // Input string
     String name = "My name is Shankar";
     
     // Call the countLetterOccurrence method to count letter occurrences
     int[] letterOccurrence = countLetterOccurrence(name);

     // Iterate through the letter occurrences array
     for (int i = 0; i < letterOccurrence.length; i++) {
         // Check if the current letter has occurrences
         if (letterOccurrence[i] > 0) {
             // Calculate the corresponding letter using ASCII value
             char letter = (char) ('a' + i);
             
             // Print the letter and its occurrences
             System.out.println("Letter: " +"'"+ letter + "'"+ " Occurrence: " + letterOccurrence[i]);
         }
     }
 }

 // Method to count letter occurrences in a given name string
 public static int[] countLetterOccurrence(String name) {
     // Array to store the count of each letter (assuming only lowercase letters are counted)
     int[] letterCount = new int[26];

     // Convert the name string to lowercase and iterate through its characters
     for (char c : name.toLowerCase().toCharArray()) {
         // Check if the character is a letter
         if (Character.isLetter(c)) {
             // Increment the count for the corresponding letter
             letterCount[c - 'a']++;
         }
     }

     // Return the array containing letter occurrences
     return letterCount;
 }
}
