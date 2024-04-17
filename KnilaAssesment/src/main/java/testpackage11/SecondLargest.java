package testpackage11;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int a[]= {10,40,30,50,60};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("SecondLargest:"+ a[a.length-2]);
		
		System.out.println("Minimum:"+ a[0]+ "  Maximun:"+ a[a.length-1]);

}
}