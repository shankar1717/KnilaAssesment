package TEST;

import java.util.*;

public class JavaMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of entries in the phone book
		System.out.println("Enter Count:");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume newline character

		// Create a HashMap to store the phone book entries
		Map<String, String> phoneBook = new HashMap<>();

		// Read phone book entries
		for (int i = 0; i < n; i++) {
			//System.out.println("Enter Name:");
			String name = scanner.nextLine();
			//System.out.println("Enter PhoneNumber:");
			String phoneNumber = scanner.nextLine();
			phoneBook.put(name, phoneNumber);
		}

		// Process queries until end-of-file
		while (scanner.hasNext()) {
			String query = scanner.nextLine();
			if (phoneBook.containsKey(query)) {
				System.out.println(query + "=" + phoneBook.get(query));
			} else {
				System.out.println("Not found");
			}
		}

		scanner.close();
	}
}





