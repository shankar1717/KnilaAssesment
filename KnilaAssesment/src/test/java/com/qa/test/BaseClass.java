package com.qa.test;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.qa.pageObjects.CommonUtils;
import com.qa.pageObjects.LoginPage;
import com.qa.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    public static Logger log;
    public Select select;
    CommonUtils common;

    // ReadConfig variables
    public ReadConfig rd = new ReadConfig();
    public String browser = rd.getUrl();
    public String userName = rd.getUsername();
    public String userPassword = rd.getPassword();
    public String location=rd.getLocation();

    @BeforeClass
    public void setUp() throws Exception {
        // Set up logger
        log = Logger.getLogger(getClass());
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		
		

        // Set up WebDriver, open the application URL, and log in
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Your other setup code...
    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
