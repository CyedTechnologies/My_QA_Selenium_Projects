package userInterface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section12AllInOne {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		// ----------------------------------- Scrolling
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,850)");
		Thread.sleep(1000);
		// -------------------------------------- Scrolling table inside in page.
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,150)");
		Thread.sleep(1000);
		// --------------------------------------- Adding the table values
		List<WebElement> table = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		int sum = 0;
		for(int i = 0; i < table.size(); i++) {
			String allValues = table.get(i).getText();
			int convertedvalues = Integer.parseInt(allValues);
			sum = sum + convertedvalues;
		}
		System.out.println(sum);
		String[] text = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":");
		String output = text[1].trim();
		int igr = Integer.parseInt(output);
		Assert.assertEquals(igr, 296);

	}

}
