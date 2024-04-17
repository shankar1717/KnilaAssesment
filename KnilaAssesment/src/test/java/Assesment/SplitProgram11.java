package Assesment;

public class SplitProgram11 {

	public static void wordPrinter(String[] s) {
		if (s.length != 0) {
			for (String w : s) {
				if (!w.isEmpty()) {
					String[] words = w.split("\\s+");
					for (String word : words) {
						System.out.println(word);
					}
					System.out.println();
				} else {
					System.out.println("Input string is empty");
				}
			}
		} else {
			System.out.println("Input string array is empty");
		}
	}

	public static void main(String[] args) {
		String input1 = "";
		String input2 = "The car is on ";
		String input3 = "i am   Running";

		String[] s = { input1, input2, input3 };
		wordPrinter(s);
	}
}
