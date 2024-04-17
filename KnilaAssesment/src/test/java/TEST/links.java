package TEST;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
		System.out.println("No Of Links:" + nooflinks.size());

		// for (int i = 0; i < nooflinks.size(); i++) {
		// System.out.println(nooflinks.get(i).getText());
		// System.out.println(nooflinks.get(i).getAttribute("href"));
		// }

		Iterator<WebElement> itr = nooflinks.iterator();
		// int counter=0;
		while (itr.hasNext()) {
			WebElement links = itr.next();
			if (links == null ) {
				System.out.println("Broken Link");
			} else {
				System.out.println("Valid Link");
			}
			System.out.println(links.getText());
		}

	}
}
