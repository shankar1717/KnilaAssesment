package testpackage11;


public class ArraySortCheckerTest {
    public static void main(String[] args) {
        // Test Case 1: One element array
        int[] testCase1 = {5};
        System.out.println("Test Case 1: " + (isSorted(testCase1) == true ? "Passed" : "Failed"));

        // Test Case 2: 6 element array, not sorted
       
        int[] testCase2 = {5, 4, 3, 9, 7, 4};
        //Arrays.sort(testCase);
        System.out.println("Test Case 2: " + (isSorted(testCase2) == true ? "Passed" : "Failed"));

        // Test Case 3: 6 element array, sorted
        int[] testCase3 = {1, 2, 3, 4, 5, 6};
        System.out.println("Test Case 3: " + (isSorted(testCase3) == true ? "Passed" : "Failed"));

        // Test Case 4: 6 element array, sorted in descending order
        int[] testCase4 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 4: " + (isSorted(testCase4) == true ? "Passed" : "Failed"));

        // Test Case 5: 6 element array, not sorted
        int[] testCase5 = {2, 5, 3, 1, 4};
        System.out.println("Test Case 5: " + (isSorted(testCase5) == true ? "Passed" : "Failed"));

        // Test Case 6: 4 element array, sorted with duplicates
        int[] testCase6 = {1, 1, 2, 3};
        System.out.println("Test Case 6: " + (isSorted(testCase6) == true ? "Passed" : "Failed"));

        // Test Case 7: 3 element array, sorted with negative numbers
        int[] testCase7 = {-1, 1, 2};
        System.out.println("Test Case 7: " + (isSorted(testCase7) == true ? "Passed" : "Failed"));
    }

    public static boolean isSorted(int[] arr) {
    	// Check if the array is null or has only one element
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Iterate through the array to check if it is sorted
        for (int i = 0; i < arr.length - 1; i++) {
        	System.out.println("Comparing: "+ arr[i]+ ">" + arr[i+1]);
            // If the current element is greater than the next element, the array is not sorted
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // If the loop completes without returning false, the array is sorted
        return true;
		
       
    }
}