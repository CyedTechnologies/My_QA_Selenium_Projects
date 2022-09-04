package userInterface;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Section11Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Revision of Section 11 - All in one

		driver.get("https://www.amazon.ca/");
		System.out.println("Total Number of Links: " + driver.findElements(By.tagName("a")).size());

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Customer Service"))).build().perform();
		Thread.sleep(1000);

		WebElement headerLinks = driver.findElement(By.cssSelector("header#navbar-main"));
		System.out.println("Total Links in Header Section: " + headerLinks.findElements(By.tagName("a")).size());

		WebElement footerLinks = driver.findElement(By.cssSelector("div#navFooter"));
		System.out.println("Total Links in Footer Section: " + footerLinks.findElements(By.tagName("a")).size());

		WebElement specificBlock2 = footerLinks
				.findElement(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']"));
		System.out.println("Total Link in Specific Block B: " + specificBlock2.findElements(By.tagName("a")).size());

		WebElement specificBlock1 = specificBlock2
				.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][1]/ul"));
		System.out.println("Total Link in Specific Block A: " + specificBlock1.findElements(By.tagName("a")).size());

		for (int i = 1; i < specificBlock1.findElements(By.tagName("a")).size(); i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			specificBlock1.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(1000);
		}
		Set <String> tabHandle = driver.getWindowHandles();
		Iterator <String> tabs = tabHandle.iterator();
				while(tabs.hasNext()) {
					driver.switchTo().window(tabs.next());
					System.out.println(driver.getTitle());
				}
	}

}
