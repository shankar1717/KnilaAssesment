package TEST;

import java.util.Arrays;

public class MaxnMin {

	public static void main(String[] args) {

		int a[] = { 11, 44, 55, 22, 33, 66 };

		Arrays.sort(a);

		System.out.println("Min:" + a[0] + "\n"+ "Max:" + a[a.length - 1]);

	}

}
