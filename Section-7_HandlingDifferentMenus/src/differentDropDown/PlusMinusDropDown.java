package differentDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlusMinusDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		// Latest drop down Menu with Plus and Minus selection
		// Practice on https://rahulshettyacademy.com/dropdownsPractise/
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		Thread.sleep(2000);
		for (int adult = 1; adult < 4; adult++) {
		driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		}
		for (int child = 1; child < 3; child++) {
			driver.findElement(By.cssSelector("span#hrefIncChd")).click();
		}
		driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();	
		Thread.sleep(2000);
		System.out.println("You selection is: "+driver.findElement(By.cssSelector("div#divpaxinfo")).getText());
	}

}
