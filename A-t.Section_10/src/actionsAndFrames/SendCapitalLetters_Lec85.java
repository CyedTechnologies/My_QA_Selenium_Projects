package actionsAndFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendCapitalLetters_Lec85 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		
		Actions actions = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
		actions.moveToElement(move).build().perform();
		WebElement capital = driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(capital).click().keyDown(Keys.SHIFT).sendKeys("lenovo laptop").doubleClick().build().perform();
		actions.moveToElement(driver.findElement(By.cssSelector("input#nav-search-submit-button"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"))).contextClick().build().perform();
		
		
	}

}
