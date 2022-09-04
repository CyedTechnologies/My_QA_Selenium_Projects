package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_TagNameAttributeValue {

	public static void main(String[] args) {
		
		// TagName[Attribute='value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		// Here: TagName[attribute='value']
		driver.findElement(By.cssSelector("input[id='inputUsername'")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[name='inputPassword'")).sendKeys("123");
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		
	}
	
}
