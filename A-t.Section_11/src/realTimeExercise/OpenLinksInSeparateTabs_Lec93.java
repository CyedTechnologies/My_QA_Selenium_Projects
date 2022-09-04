package realTimeExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinksInSeparateTabs_Lec93 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		// -----------------------------------Open Links in Separate Tabs
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement subSection = driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println("Subsection Links: "+subSection.findElements(By.tagName("a")).size());
		Thread.sleep(1000);
		WebElement block1 = subSection.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		System.out.println("Links in Block A: "+block1.findElements(By.tagName("a")).size());
		int fiveLinks = block1.findElements(By.tagName("a")).size();
		for (int i = 1; i < fiveLinks; i++) {
			String clicks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			block1.findElements(By.tagName("a")).get(i).sendKeys(clicks);
		}

	}

}
