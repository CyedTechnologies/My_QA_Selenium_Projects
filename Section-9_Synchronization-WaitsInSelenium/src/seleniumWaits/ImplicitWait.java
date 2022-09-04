package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static WebDriver driver;
	public static String browser = "chrome";
	public static void main(String[] args) {
		
		// Implicit Wait: It used tell the web driver to wait for a certain amount
		// of time before it throws exception such as "No Such Element Exception".
		// Implicit wait time is applied to all the elements in the script
		// and here we do not need to specify ExpectedConditions.
		// Example: driver.manage().timeout().implicitlyWait(Duration.ofSeconds(5));
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// Here: Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys("Apple ");
		driver.findElement(By.xpath("//button[@class='search-button']")).click();
		driver.findElement(By.xpath("//div[@class='product-action']")).click();
		
	}

}
