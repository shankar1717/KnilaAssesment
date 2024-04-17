package asses;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class CookieAnalysis {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	 WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open www.smythstoys.com
        driver.get("https://www.smythstoys.com");

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Total Cookies :" + cookies.size());

        // 1. Print all cookies and their details
        System.out.println("All Cookies:");
        for (Cookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName());
            System.out.println("Value: " + cookie.getValue());
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path: " + cookie.getPath());
            System.out.println("Expiry: " + cookie.getExpiry());
            System.out.println("Is Secure?: " + cookie.isSecure());
            System.out.println("Is HttpOnly?: " + cookie.isHttpOnly());
            System.out.println("---------------------------------------");
        }

        // 2. Categorize cookies
        System.out.println("Cookie Categorization:");
        for (Cookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName());
            // Categorize cookies based on their purpose and functionality
            // You can implement your categorization logic here
        }

        // 3. Third-party cookies
        System.out.println("Third-Party Cookies:");
        for (Cookie cookie : cookies) {
            if (!cookie.getDomain().contains("smythstoys.com")) {
                System.out.println("Name: " + cookie.getName());
                System.out.println("Domain: " + cookie.getDomain());
                System.out.println("---------------------------------------");
            }
        }

        // 4. Impact of third-party cookie policy
        // You can discuss the potential impact based on your analysis

        // 5. Mitigations / Corrective actions
        // You can suggest strategies based on your analysis

        // Close the browser
        driver.quit();
    }
}
