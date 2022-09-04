package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TagNameTextEqualTextValue {

	public static void main(String[] args) {
		
		// TagName[Text()='TextValue']
        // -- //span[text()='Login']
		// Practice on http://qaclickacademy.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Here: TagName[Text()='TextValue']
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
	}

}
