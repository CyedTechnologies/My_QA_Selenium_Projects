package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_ParentTagNameSpaceChildTagName {

	public static void main(String[] args) {
		
		// ParentTagName ChildTagName
		// Note there is space between parent and child tag name.
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.partialLinkText("Forgot")).click();
		// Here: ParentTagName ChildTagName
		System.out.println(driver.findElement(By.cssSelector("form h2")).getText());
		

	}

}
