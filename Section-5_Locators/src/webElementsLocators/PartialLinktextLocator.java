package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PartialLinktextLocator {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		// Partial Link text locator
		// https://rahulshettyacademy.com/locatorspractice/
		// Practice on "Forgot your password?" link text

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Here: Partial link text locator above the SIGN IN button.
		driver.findElement(By.partialLinkText("Forgot")).click();
		
	}

}
