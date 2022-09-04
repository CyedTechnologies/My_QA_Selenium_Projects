package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingPartialTextDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,300)");
		
		WebElement passingValues = driver.findElement(By.cssSelector("input#autocomplete"));
		passingValues.sendKeys("Can");
		Thread.sleep(1000);
		passingValues.sendKeys(Keys.DOWN);
		passingValues.sendKeys(Keys.DOWN);
		passingValues.sendKeys(Keys.ENTER);
		System.out.println(passingValues.getAttribute("value"));

	}

}
