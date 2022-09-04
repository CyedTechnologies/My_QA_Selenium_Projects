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

public class AddingToCartMultipleTtems {

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
		// Adding Multiple Items to the Cart
		int j = 0;
		String [] productsArrayList = {"Brocolli", "Tomato", "Cucumber"}; 
		List<WebElement> productsName = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productsName.size(); i++) {
			String[] productsList = productsName.get(i).getText().split("-");
			String formatedList = productsList[0].trim();
			List<String> list = Arrays.asList(productsArrayList);
			if (list.contains(formatedList)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j == productsArrayList.length)
					break;
			}
			
		}
		
		
		
	}

}
