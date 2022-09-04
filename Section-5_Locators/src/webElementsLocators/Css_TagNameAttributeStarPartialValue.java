package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_TagNameAttributeStarPartialValue {

	public static void main(String[] args) {
		
		// TagName[Attribute*='partial value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		// Here: TagName[Attribute*='partial value']
		driver.findElement(By.cssSelector("input[id*='input']")).sendKeys("qab");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("abc");
		driver.findElement(By.cssSelector("button[type*='sub']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	}

}
