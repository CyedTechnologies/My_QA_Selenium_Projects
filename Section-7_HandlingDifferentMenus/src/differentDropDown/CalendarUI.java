package differentDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Handling Calendar (Departure Date Selection)
				List<WebElement> depDates = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
				for (WebElement depDate:depDates) {
					if (depDate.getText().equalsIgnoreCase("29")) {
						System.out.println("Departure Date is: "+depDate.getText());
						depDate.click();
						break;
					}
				}
				Thread.sleep(500);
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).click();
				// Handling Calendar (Arrival Date Selection)
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).click();
				List<WebElement> arrDates = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
				for (WebElement arrDate:arrDates) {
					if (arrDate.getText().equalsIgnoreCase("30")) {
						System.out.println("Arrival Date is : "+arrDate.getText());
						arrDate.click();
						break;
					}
				}
	}

}
