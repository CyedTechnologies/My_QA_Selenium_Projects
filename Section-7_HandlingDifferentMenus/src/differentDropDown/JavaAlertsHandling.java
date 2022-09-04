package differentDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaAlertsHandling {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys("Sikandar");
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(600);
		driver.findElement(By.cssSelector("input[class='inputs']")).clear();
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys("Sikandar Azam");
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	}

}
