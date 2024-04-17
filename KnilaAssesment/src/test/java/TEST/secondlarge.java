package TEST;

public class secondlarge {
	public static void main(String[] args) {
		int[] a = { 40, 20, 30, 50, 10 };

		// Initialize variables to store the largest and second largest numbers
		int largest = a[0]; // Assume the first element is the largest
		int secondLargest = a[0]; // Assume the first element is also the second largest

		// Iterate through the array to find the largest and second largest numbers
		for (int i = 0; i < a.length; i++) {
			// Check if the current element is greater than the current largest number
			if (a[i] > largest) {
				// secondLargest = largest; // Update the second largest number
				largest = a[i]; // Update the largest number
				// System.out.println(a[i]);
			}
			// Check if the current element is greater than the current second largest
			// number
			else if (a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i]; // Update the second largest number
				// System.out.println(a[i]);
			}

		}

		// Print the second largest number
		System.out.println("Second Largest: " + secondLargest);

	}
}