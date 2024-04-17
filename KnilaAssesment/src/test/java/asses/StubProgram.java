package asses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StubProgram {
    
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        WebDriverManager.chromedriver().setup();

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the e-commerce website
        driver.get("https://www.example.com");

        // Stub: Simulate authentication service response
        boolean isAuthenticated = simulateAuthenticationService();

        // Driver: Enter credentials and submit login form
        if (isAuthenticated) {
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("login-btn"));

            usernameField.sendKeys("testuser");
            passwordField.sendKeys("password");
            loginButton.click();
        }

        // Verify if login was successful
        String expectedWelcomeMessage = "Welcome, testuser!";
        WebElement welcomeMessageElement = driver.findElement(By.id("welcome-message"));
        String actualWelcomeMessage = welcomeMessageElement.getText();

        if (actualWelcomeMessage.equals(expectedWelcomeMessage)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.quit();
    }

    // Stub: Simulate authentication service response
    private static boolean simulateAuthenticationService() {
        // For demonstration purposes, assume authentication is successful
        return true;
    }
}
