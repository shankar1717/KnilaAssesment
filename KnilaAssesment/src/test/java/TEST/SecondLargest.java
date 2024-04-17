package TEST;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int a[]= {10,40,30};
		
		Arrays.sort(a);
		
		System.out.println("After Sorting:" + Arrays.toString(a));
		
		System.out.println("SecondLargest:"+ a[a.length-2]);

}
}