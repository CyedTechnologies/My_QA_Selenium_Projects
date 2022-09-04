package section12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableValuesAdding_Lec101 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		// ----------------------------------- Scrolling
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,850)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,150)");
		
		List <WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int j = 0;
		for (int i = 0; i < values.size(); i++) {
			
		j = j + Integer.parseInt(values.get(i).getText());		
		}
		System.out.println("Total is: "+j);
		// Total Amount Collected: 296
		String [] one = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":");
		String integer = one[1].trim();
		int a = Integer.parseInt(integer);
		System.out.println(a);
		Assert.assertEquals(a, 296);
		
	}
}
