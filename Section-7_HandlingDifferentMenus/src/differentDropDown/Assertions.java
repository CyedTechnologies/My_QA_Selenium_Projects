package differentDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		// ------------------------- All Common Before
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//--------------------------
		
		// Round Trip selection
		List <WebElement> totalRedio = driver.findElements(By.xpath("//table[@class='tblTrip']//tr/td"));
		for (WebElement onlyOne:totalRedio) {
			if(onlyOne.getText().equalsIgnoreCase("Round Trip")) {
				driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
				System.out.println("Is Round Trip Selection is Selected: "+driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).isSelected());
			}
		}
		// -------------------------
		
		// Travel From
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
		Thread.sleep(500);
		WebElement select1 = driver.findElement(By.linkText("Dubai, All Airports(DWC) (DXB)"));
		select1.click();
		// Assertion for Travel From
		Assert.assertEquals(select1.getText(), "Dubai, All Airports(DWC) (DXB)");
		System.out.println("Departure Destination is : "+select1.getText());
		Thread.sleep(1000);
		// Travel To
		driver.findElement(By.linkText("Bangkok (BKK)")).click();
		// Assertion for Travel To
		Assert.assertEquals(driver.findElement(By.linkText("Bangkok (BKK)")).getText(), "Bangkok (BKK)");
		System.out.println("Arrival Destination is : "+driver.findElement(By.linkText("Bangkok (BKK)")).getText());
		Thread.sleep(500);
		// ------------------------
		
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
		Thread.sleep(500);
		// -------------------------
		
		// PASSENGERS Adults and Child Selection
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
			driver.findElement(By.cssSelector("span#hrefIncChd")).click();
			driver.findElement(By.cssSelector("span#hrefIncInf")).click();
		}
		driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();
		Thread.sleep(500);
		// -------------------------
		
		// Currency Selection
		WebElement menu = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select select = new Select(menu);
		select.selectByIndex(3);
		
	}
}
