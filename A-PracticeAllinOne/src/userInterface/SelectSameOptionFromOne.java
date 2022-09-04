package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSameOptionFromOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String grabedText = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		
		WebElement dropMenu = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(dropMenu);
		dropDown.selectByVisibleText(grabedText);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(grabedText);
		WebElement button = driver.findElement(By.id("alertbtn"));
		button.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}

}
