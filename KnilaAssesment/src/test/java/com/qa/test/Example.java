package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Example {
    WebDriver driver;  // You need to initialize this WebDriver somewhere

    @Test
    public void table() {
        // locate the table element
        WebElement table = driver.findElement(By.xpath("//table[@id='myTable']"));

        // locate all rows in the table
        List<WebElement> rows = table.findElements(By.xpath(".//tr"));

        // iterate through each row
        for (WebElement row : rows) {
            // locate all cells in the row
            List<WebElement> cells = row.findElements(By.xpath(".//td"));

            // iterate through each cell and print its text
            for (WebElement cell : cells) {
                System.out.println(cell.getText());
            }
        }

        // locate the row containing the element you want
        WebElement specificRow = table.findElement(By.xpath("//tr[contains(@class, 'myRow')]"));

        // locate the specific element within the row
        WebElement specificElement = specificRow.findElement(By.xpath("//td[contains(text(), 'myValue')]"));

        // You can perform actions with the specificElement as needed
    }
}
