package TEST;

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

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));

	    List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
		
		System.out.println("Size" + list.size());
		
		for (WebElement element : list) {
			System.out.println(element.getText());
			if (element.getText().equals("selenium webdriver")) {
			element.click();
			continue;
			}
		}

	}

}
