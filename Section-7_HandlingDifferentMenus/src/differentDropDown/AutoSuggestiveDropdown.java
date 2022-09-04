package differentDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestiveDropdown {
public static String browser = "chrome";
public static WebDriver driver;
	public static void main(String[] args) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("Sau");
		List<WebElement> lists = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for (WebElement list:lists) {
			if (list.getText().equalsIgnoreCase("Saudi Arabia")) {
					list.click();
			}
		}
			
	}
}
