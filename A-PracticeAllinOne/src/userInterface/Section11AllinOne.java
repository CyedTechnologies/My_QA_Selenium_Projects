package userInterface;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section11AllinOne {

	public static WebDriver driver;
	public static String browser = "chrome";
	public static void main(String[] args) throws InterruptedException {
		// https://www.rahulshettyacademy.com/AutomationPractice/
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> totalTages = driver.findElements(By.tagName("a"));
		System.out.println(totalTages.size());
		
		WebElement scope = driver.findElement(By.id("gf-BIG"));
		System.out.println(scope.findElements(By.tagName("a")).size());
		
		WebElement partialScope = scope.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
		System.out.println(partialScope.findElements(By.tagName("a")).size());
		
		for (int i = 0; i < partialScope.findElements(By.tagName("a")).size(); i++) {
			
			String clicking = Keys.chord(Keys.CONTROL, Keys.ENTER);
			partialScope.findElements(By.tagName("a")).get(i).sendKeys(clicking);
		}
		Set <String> wh = driver.getWindowHandles();
		Iterator <String> tabs = wh.iterator();
		
		while (tabs.hasNext()) {
			driver.switchTo().window(tabs.next());
			System.out.println(driver.getTitle());
		}
	}

}
