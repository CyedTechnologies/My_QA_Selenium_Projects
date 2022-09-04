package userInterface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("Pa");
		Thread.sleep(2000);
		List<WebElement> autolists = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for (WebElement option:autolists) {
			if (option.getText().equalsIgnoreCase("Pakistan")) {
				option.click();
				break;
			}
		}
	}

}
