package asses;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class CookieExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.smythstoys.com/");

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();

        // Print details of each cookie
        for (Cookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName());
            System.out.println("Value: " + cookie.getValue());
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path: " + cookie.getPath());
            System.out.println("Expiry: " + cookie.getExpiry());
            System.out.println("Is Secure?: " + cookie.isSecure());
            System.out.println("Is HttpOnly?: " + cookie.isHttpOnly());
            System.out.println("--------------------------------------------------");
        }

        // Close the browser
        driver.quit();
    }
}
