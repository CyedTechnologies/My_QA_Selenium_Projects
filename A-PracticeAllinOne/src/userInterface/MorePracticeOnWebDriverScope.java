package userInterface;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MorePracticeOnWebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("All Links: "+driver.findElements(By.tagName("a")).size());
		
		WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		System.out.println("Links in Footer Section: "+footerSection.findElements(By.tagName("a")).size());
		
		WebElement specificArea = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[4]/ul"));
		System.out.println("Links in Specific Section: "+specificArea.findElements(By.tagName("a")).size());
		
		List<WebElement> listOfLinks = specificArea.findElements(By.tagName("a"));
		for(int i = 1; i < listOfLinks.size(); i++) {
			String clicks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			listOfLinks.get(i).sendKeys(clicks);
		}
		Set <String> tabControl = driver.getWindowHandles();
		Iterator <String> tabs = tabControl.iterator();
		while (tabs.hasNext()) {
			driver.switchTo().window(tabs.next());
			System.out.println(driver.getTitle());
		}
	}

}
