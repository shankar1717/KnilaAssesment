package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PureCodeTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testElementProperties() {
        driver.get("https://purecode.ai/");

        WebElement element = driver.findElement(By.xpath("//button[@class='mantine-UnstyledButton-root mantine-Button-root mantine-1ur2zib']"));
        System.out.println("Text:" + element.getText());

        String backGroundColour = element.getCssValue("background-color");
        String colorPropertyValue = element.getCssValue("color");
        String fontValue = element.getCssValue("font");

        Dimension size = element.getSize();

        long width = size.getWidth();
        long height = size.getHeight();
        Object location = element.getLocation();
        
        System.out.println("X : " + ((org.openqa.selenium.Point) location).getX());
        System.out.println("Y : " + ((org.openqa.selenium.Point) location).getY());
        System.out.println("X, Y - coordinates : " + location); 
        System.out.println("backGroundColour:" + backGroundColour);
        System.out.println("width:" + width);
        System.out.println("height:" + height);
        System.out.println("fontValue:" + fontValue);
        System.out.println("colorPropertyValue:" + colorPropertyValue);

        // Assertion for the background color
        Assert.assertEquals(backGroundColour, "rgba(0, 0, 0, 0)");

        // Assertion for the width
        Assert.assertEquals(width, 149);

        // Assertion for the height
        Assert.assertEquals(height, 50);

        // Assertion for the color
        Assert.assertEquals(colorPropertyValue, "rgba(0, 0, 0, 1)");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
