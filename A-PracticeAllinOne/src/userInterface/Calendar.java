package userInterface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		List <WebElement> calendar = driver.findElements(By.className("day"));
		for (int i =0; i < calendar.size(); i++) {
			calendar.get(i).getText(); 
			
			if(calendar.get(i).getText().contains("30")) {
				calendar.get(i).click();
			
			}
		}
		
		
	}

}
