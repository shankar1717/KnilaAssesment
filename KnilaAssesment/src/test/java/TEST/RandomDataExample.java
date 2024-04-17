package TEST;

import java.util.Random;

public class RandomDataExample {

    public static void main(String[] args) {
        // Generate a random email address and store it in randomEmail variable
        String randomEmail = generateRandomEmail();
        
        // Print the generated email address
        System.out.println("Random Email Address: " + randomEmail);
    }

    // Define a method to generate a random email address
    private static String generateRandomEmail() {
        // Define a string containing all allowed characters for the local part of the email
        String allowedChars = "abcdefghijklmnopqrstuvwxyz";
        
        // Initialize a StringBuilder to construct the email address
        StringBuilder randomEmail = new StringBuilder();

        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Iterate 8 times to generate a random string of length 8 for the local part of the email
        for (int i = 0; i < 8; i++) {
            // Generate a random index within the range of allowedChars string
            int randomIndex = random.nextInt(allowedChars.length());
            
            // Get the character at the random index from allowedChars and append it to randomEmail
            char randomChar = allowedChars.charAt(randomIndex);
            randomEmail.append(randomChar);
            
//           // Generate a random string of length 8 for the local part of the email
//                char randomChar = allowedChars.charAt(random.nextInt(allowedChars.length()));
//                randomEmail.append(randomChar);
//            }
        }

        // Append the domain part to complete the email address
        randomEmail.append("@example.com");

        // Convert the StringBuilder object to a string and return the generated email address
        return randomEmail.toString();
    }
}
