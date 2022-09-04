package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		Actions actions = new Actions(driver);
		WebElement path = driver.findElement(By.linkText("A/B Testing"));
		actions.moveToElement(path).contextClick().build().perform();
		
		WebElement dou = driver.findElement(By.xpath("//h1[@class='heading']"));
		actions.moveToElement(dou).doubleClick().build().perform();
	}

}
