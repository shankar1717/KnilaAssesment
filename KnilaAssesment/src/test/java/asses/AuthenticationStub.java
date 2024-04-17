package asses;

public class AuthenticationStub {
	
	
    public  boolean authenticate(String username, String password) {
        // Simulate authentication service response (always return true)
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of AuthenticationStub
        AuthenticationStub stub = new AuthenticationStub();

        // Call the authenticate method with sample credentials
        String username = "testuser";
        String password = "password";
        boolean isAuthenticated = stub.authenticate(username, password);

        // Print the result
        if (isAuthenticated) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}
