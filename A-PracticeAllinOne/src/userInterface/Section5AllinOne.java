package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section5AllinOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).sendKeys("selenium123");
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Jamey");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Jarom");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("jame");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jame@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456678");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'forgot-pwd-btn-conainer')]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul4321");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
