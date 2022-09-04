package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameLocator {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		// In the Class Name if there is a space in between then
		// take only one part as a class name.	
		// https://rahulshettyacademy.com/locatorspractice/
		// Practice on User Name, Password and Login Button
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul123");
		// class name here
		driver.findElement(By.className("signInBtn")).click();
		
	}

}
