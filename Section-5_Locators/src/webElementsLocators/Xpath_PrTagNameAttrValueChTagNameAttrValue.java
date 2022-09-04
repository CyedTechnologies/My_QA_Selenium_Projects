package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_PrTagNameAttrValueChTagNameAttrValue {

	public static void main(String[] args) throws InterruptedException {
		
		// -- //ParrentTagname[@Attribute=’value’]//ChildTagname[@Attribute=’value’]
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("qwe");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-container'][1]")).click();
		Thread.sleep(1000);
		// Here: //ParrentTagname[@Attribute=’value’]//ChildTagname[@Attribute=’value’]
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']//input[@placeholder='Name']")).sendKeys("Gin");
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']//input[@placeholder='Name']")).sendKeys("gd@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']//input[@placeholder='Phone Number']")).sendKeys("416 432 3433");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']//button[@class='reset-pwd-btn']")).click();
	}

}
