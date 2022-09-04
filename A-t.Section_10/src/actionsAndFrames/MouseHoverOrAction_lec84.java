package actionsAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOrAction_lec84 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		// Mouse hover on element
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']"))).build().perform();
		
		
		
		

	}

}
