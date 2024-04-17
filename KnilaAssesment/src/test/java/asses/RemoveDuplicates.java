package asses;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Given array with duplicate elements
		String[] arr = { "java", "python", "javascript", "java" };

		// Variable to store the length of the array
		int length = arr.length;

		// Loop through the array to find and remove duplicates
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				// Compare elements at index i and j for equality
				if (arr[i].equals(arr[j])) {
					// If duplicate found, shift elements to the left to overwrite duplicate
					for (int k = j; k < length - 1; k++) {
						arr[k] = arr[k + 1];
					}
					// Decrement length and adjust j to recheck current index
					length--;
					j--;
				}
			}
		}

		// Create a new array with unique elements by copying the original array
		// up to the new length
		String[] uniqueArr = Arrays.copyOf(arr, length);

		// Print unique elements
		System.out.println("Unique Elements:");
		for (String string : uniqueArr) {
			System.out.println(string);
		}
	}
}
