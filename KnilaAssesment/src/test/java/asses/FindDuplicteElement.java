package asses;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicteElement {

	public static void main(String[] args) {

		String[] arr = { "java", "python", "javascript", "java" };

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("Duplicate Element is: " + arr[i]);
//				}
//
//			}
//		}
//
//	}
		
//		Set<String > set =new HashSet<>();
//		for (String string : arr) {
//			set.add(string);
//		}
//		
//		for (String string : set) {
//			System.out.println(string);
//
//		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] .equals (arr[j])) {
					for (int k = 0; k < arr.length; k++) {
						
						arr[k]=arr[k+1];
					}
					arr.length--;//Reduce array length
				}
				j--;// index after shifting 
			}
		}
	
	arr=Arrays.copyOf(arr, arr.length);
	
	System.out.println("Unoque Elements");
	for (String string : arr) {
		System.out.println(string);
	}
		
		

}
}