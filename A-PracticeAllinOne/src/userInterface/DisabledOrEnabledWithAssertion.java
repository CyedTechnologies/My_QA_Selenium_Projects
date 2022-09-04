package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DisabledOrEnabledWithAssertion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
		if(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(false);
			System.out.println("Disabiled");
		}
			Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style");
		if (driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
			System.out.println("Enabled");
		}
		
	}

}
