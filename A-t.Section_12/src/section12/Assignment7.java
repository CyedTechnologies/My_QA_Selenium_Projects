package section12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,850)");
		List <WebElement> totalRows = driver.findElements(By.cssSelector(".left-align table#product tr"));
		System.out.println("Total Number of Rows: "+totalRows.size());
		List <WebElement> totalColumn = driver.findElements(By.cssSelector(".left-align table#product tr th"));
		System.out.println("Total Number of Columns: "+totalColumn.size());
		WebElement secondRwoText = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]"));
		System.out.println(secondRwoText.getText());
		
		

	}

}
