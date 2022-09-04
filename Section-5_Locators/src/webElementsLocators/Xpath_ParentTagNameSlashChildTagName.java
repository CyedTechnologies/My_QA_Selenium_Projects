package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_ParentTagNameSlashChildTagName {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
		// -- //ParentTagName/ChildTagName
		
	if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if (browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	// Here: //ParentTagName/ChildTagName
	//		 //form/h1
	System.out.println(driver.findElement(By.xpath("//form/h1")).getText());
	
		
	}

}
