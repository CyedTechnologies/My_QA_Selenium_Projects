package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TagNameAttributeValue {

	public static void main(String[] args) {
		
		// -- //TagName[@Attribute='value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Here: //TagName[@Attribute='value']
		//		 //input[@id='inputUsername']
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("qwe");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	}

}
