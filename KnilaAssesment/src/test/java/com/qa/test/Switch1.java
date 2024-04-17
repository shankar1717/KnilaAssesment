package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch1 {
    WebDriver driver;

    @Test
    public void login() {
        // Specify the desired browser: "firefox", "chrome", "msedge", or "IE"
        String browserType = "firefox";

        switch (browserType.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;


            case "msedge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;


            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                driver = null;
                System.out.println("Driver is Null");
                break;
        }

        // Perform some actions with the WebDriver (e.g., navigate to a URL)
        driver.get("https://www.google.com");

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
