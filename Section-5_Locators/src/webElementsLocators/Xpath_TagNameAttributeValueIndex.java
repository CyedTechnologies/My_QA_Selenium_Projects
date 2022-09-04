package webElementsLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_TagNameAttributeValueIndex {

	public static void main(String[] args) throws InterruptedException {
		
		// (//tagName[@Attribute=’value’])[Index]
		// (//input[@type='text'])[1]
		// https://rahulshettyacademy.com/locatorspractice/
		
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
		// Here: (//tagName[@Attribute=’value’])[Index]
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("416000");
		driver.findElement(By.xpath("(//button[@class='reset-pwd-btn'])")).click();

	}

}
