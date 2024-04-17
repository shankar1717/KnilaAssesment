package com.qa.test;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement searchBox = driver.findElement(By.xpath("//*[@name='q']"));
            searchBox.sendKeys("selenium");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='G43f7e']//li")));
            
            System.out.println("Size: " + list.size());
            
            for (WebElement element : list) {
                System.out.println("Text: " + element.getText());
                if (element.getText().equals("selenium download")) {
                    element.click();
                    continue;
                }
            }
        } finally {
            //driver.quit();
        }
    }
}
