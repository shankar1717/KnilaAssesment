package com.qa.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.test.BaseClass;

public class CommonUtils extends BaseClass {
    // This declares a class named 'CommonUtils' that extends (inherits from) 'BaseClass'.

    public WebDriver ldriver;
    // This declares a public variable 'ldriver' of type WebDriver, which will be used to store the WebDriver instance.

    // public WebDriverWait wait;
    // This line is commented out, indicating that the WebDriverWait instance is not being used in this class.

    public CommonUtils(WebDriver rdriver) {
        // This is a constructor for the 'CommonUtils' class, taking a WebDriver parameter 'rdriver'.

        ldriver = rdriver;
        // This initializes the 'ldriver' variable with the value of the 'rdriver' parameter passed to the constructor.

        PageFactory.initElements(rdriver, this);
        // This initializes the elements of the 'CommonUtils' class using PageFactory. It associates the 'rdriver' with the current instance of 'CommonUtils'.
    }

	/**
	 * Waits for the visibility of the given WebElement with a specified timeout.
	 *
	 * @param element          The WebElement to wait for.
	 * @param timeoutInSeconds The maximum time to wait for the element to be
	 *                         visible, in seconds.
	 */
	public void waitForElementToBeVisible(WebElement element, Duration timeoutInSeconds) {
		wait = new WebDriverWait(ldriver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElement(By by) {
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void waitForElementPresence(WebElement element) {
		wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
	}

	/**
	 * Waits for the presence of the element located by the given By object with a
	 * specified timeout.
	 *
	 * @param by               The By object used to locate the element.
	 * @param timeoutInSeconds The maximum time to wait for the presence of the
	 *                         element, in seconds.
	 * @return The located WebElement.
	 */
	public WebElement waitForElement(By by, Duration timeoutInSeconds) {
		wait = new WebDriverWait(ldriver, timeoutInSeconds);
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	// Add more common reusable methods as needed
}
