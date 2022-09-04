package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_TagnemHashId {

	public static void main(String[] args) {
		
		// tagName#id
		// In the Class Name if there is a space in between then
		// take only one part as a class name.
		// https://rahulshettyacademy.com/locatorspractice/
		// Practice on User Name, Password and Login Button

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Here: tagName#id
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Udemy");
		driver.findElement(By.name("inputPassword")).sendKeys("Udemy123");
		driver.findElement(By.className("signInBtn")).click();
		
	}

}
