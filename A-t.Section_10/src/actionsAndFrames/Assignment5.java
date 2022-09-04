package actionsAndFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");

		assignment5(driver);
		
	}
	public static void assignment5(WebDriver driver) {

		driver.findElement(By.linkText("Nested Frames")).click();
		WebElement frame1 = driver.findElement(By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(frame2);
		WebElement requiredText = driver.findElement(By.id("content"));
		System.out.println(requiredText.getText());
		driver.switchTo().defaultContent();

	}
}
