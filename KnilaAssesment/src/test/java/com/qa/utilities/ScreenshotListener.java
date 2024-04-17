package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.test.BaseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
/*


	// private WebDriver driver;


    // Default constructor
    public ScreenshotListener() {
    }
//	private WebDriver driver;
//
//	public ScreenshotListener(WebDriver driver) {
//		this.driver = driver;
//	}

	@Override
	public void onTestFailure(ITestResult result) {
		screenshot(result.getName() + "_Failure");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		screenshot(result.getName() + "_Success");
	}

//	private void captureScreenshot(String screenshotName) {
//		System.out.println("Taking Screenshot...");
//
//		// Get the driver from the Baseclass
//		// WebDriver driver = getDriver();
//
//		// TakesScreenshot is an interface of Selenium that captures the screenshot
//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		// Call getScreenshotAs method to create an image file
//		File source = ts.getScreenshotAs(OutputType.FILE);
//
//		// Define the path where you want to save the screenshot
//		String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
//
//		// Create a destination file
//		File destination = new File(screenshotPath);
//
//		try {
//			// Use FileUtils.copyFile method to save the screenshot at the desired location
//			FileUtils.copyFile(source, destination);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("Screenshot taken at: " + screenshotPath);
//	}

	// Other ITestListener methods (onTestStart, onTestSkipped, etc.) can be
	// implemented as needed.

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}
	private void screenshot(String scrrenshotName, WebDriver driver) {
        // Get the driver from the Baseclass
        //WebDriver driver = getDriver();

        // TakesScreenshot is an interface of Selenium that captures the screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Call getScreenshotAs method to create an image file
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Define the path where you want to save the screenshot
        String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + scrrenshotName +  ".png";

        // Create a destination file
        File destination = new File(screenshotPath);

        try {
            // Use FileUtils.copyFile method to save the screenshot at the desired location
            FileUtils.copyFile(source, destination);
            log.info("    Screenshot captured: " + scrrenshotName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println("Screenshot taken at: " + screenshotPath);
    }
}
*/