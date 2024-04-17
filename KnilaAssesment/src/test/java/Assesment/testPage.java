package Assesment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testPage {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert a =driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		
		WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(result.getText());
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		a.dismiss();
		Thread.sleep(2000);
		System.out.println(result.getText());
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		a.sendKeys("JA alert");
		a.accept();
		System.out.println(result.getText());
	}

}
