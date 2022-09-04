package realTimeExercise;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScop_Lec92 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		// -----------------------------------Web Driver Scope (Links in subsection)
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement subSection = driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println("Subsection Links: "+subSection.findElements(By.tagName("a")).size());
		Thread.sleep(1000);
		WebElement block1 = subSection.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		System.out.println("Links in Block A: "+block1.findElements(By.tagName("a")).size());
		
		
	}

}
