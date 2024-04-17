package Assesment;

public class splitProgram33 {

	public static void main(String[] args) {

		String s = "I Run every    day 11   KM";
		String s1 = "I Run every    day 2222   KM";
		String s2 = "I Run every    day 33333   KM";

		wordPrinter(s, s1, s2);
	}

	public static void wordPrinter(String... strings) {
		// public static void wordPrinter(String s,String s1,String s2) {

		for (int i = 0; i < strings.length; i++) {

			String s = strings[i];

			String word[] = s.split("\\s+");
			
			for (int j = 0; j < word.length; j++) {
				
				System.out.println(word[j]);
			}
			System.out.println("======");
		}
	}

}
