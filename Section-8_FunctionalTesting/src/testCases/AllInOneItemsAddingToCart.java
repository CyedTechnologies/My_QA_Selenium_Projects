package testCases;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllInOneItemsAddingToCart {
	public static WebDriver driver;
	public static String browser = "chrome";
	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// All in One Adding Multiple Items to the Cart and Proceeds
		
		String [] productsArray = {"Brocolli", "Cauliflower", "Cucumber", "Beetroot"};
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i <products.size(); i++) {
			String productsName = products.get(i).getText();
			String[] trimName = productsName.split("-");
			String formatedName = trimName[0].trim();
			List<String> list = Arrays.asList(productsArray);
			if (list.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			}
			
			
		}
		
		
		
	}

}
