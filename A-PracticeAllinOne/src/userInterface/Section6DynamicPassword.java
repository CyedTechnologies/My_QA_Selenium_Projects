package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section6DynamicPassword {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		String userN = getUserName(driver);
		String userP = getUserPassword(driver);

		driver.findElement(By.id("user-name")).sendKeys(userN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(userP);
		driver.findElement(By.cssSelector("input#login-button")).click();

	}

	public static String getUserName(WebDriver driver) {
		driver.get("https://www.saucedemo.com/");
		String userName = (driver.findElement(By.id("login_credentials")).getText());
		String[] userNameArray = userName.split(":");
		String[] userNameArray1 = userNameArray[1].split("locked");
		String userNameFinal = userNameArray1[0];
		return userNameFinal;
	}

	public static String getUserPassword(WebDriver driver) {
		driver.get("https://www.saucedemo.com/");
		String userPassword = (driver.findElement(By.cssSelector(".login_password")).getText());
		String[] userPasswordArray = userPassword.split(":");
		String userPasswordFinal = userPasswordArray[1];
		return userPasswordFinal;
	}
}
