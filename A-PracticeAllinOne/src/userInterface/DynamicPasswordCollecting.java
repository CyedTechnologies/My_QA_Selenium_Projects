package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicPasswordCollecting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String userName = "Rahul";
		String password = getMyPassword(driver);		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
	}

	public static String getMyPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(2000);
		String printedText = driver.findElement(By.cssSelector("form p")).getText();
		String [] printedTextArray1 = printedText.split("'");
		String [] printedTextArray2 = printedTextArray1[1].split("'");
		String userPassword = printedTextArray2[0];
		return userPassword;
		
	}
}
