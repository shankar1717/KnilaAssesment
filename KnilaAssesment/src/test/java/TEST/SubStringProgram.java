package TEST;

import java.util.Scanner;

public class SubStringProgram {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter String");
	        // Read the input string
	        String inputString = scanner.nextLine();
	        System.out.println("Enter Start Index");
	        // Read the indices
	        int startIndex = scanner.nextInt();
	        System.out.println("Enter End Index");

	        int endIndex = scanner.nextInt();

	        // Extract the substring using substring(startIndex, endIndex+1) since endIndex is inclusive
	        String substring = inputString.substring(startIndex, endIndex );
	        String substring11 = inputString.substring(3,7);

	        // Print the substring
	        System.out.println(substring);
	        System.out.println(substring11);


	        // Close the scanner
	        scanner.close();
	    }
	}

