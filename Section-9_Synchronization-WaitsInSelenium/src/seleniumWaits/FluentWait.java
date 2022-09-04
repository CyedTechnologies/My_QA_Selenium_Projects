package seleniumWaits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		//WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		
		/*
		
		Wait <WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(21))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
				
				fWait.until(new Function<WebDriver, WebElement>() {
					public WebElement apply(WebDriver driver) {
					if (driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
						return driver.findElement(By.xpath("//div[@id='finish']/h4"));
					}
					else
						return null;
					}
				});
				System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
		*/
	}
}
		
		