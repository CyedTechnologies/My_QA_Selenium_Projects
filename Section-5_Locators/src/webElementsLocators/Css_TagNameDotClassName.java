package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_TagNameDotClassName {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		// TagName.ClassName OR .ClassName
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[type='password'")).sendKeys("123");
		// Here: TagName.ClassName OR .ClassName
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		
	}

}
