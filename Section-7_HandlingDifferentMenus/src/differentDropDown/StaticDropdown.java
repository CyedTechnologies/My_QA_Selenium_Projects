package differentDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Static DropDown Menus 
		// Practice on https://rahulshettyacademy.com/dropdownsPractise/
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//Here: Static Drop down menu
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select menu = new Select(dropdown);
		menu.selectByIndex(3);
		System.out.println(menu.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		menu.selectByIndex(2);
		System.out.println(menu.getFirstSelectedOption().getText());
		Assert.assertEquals(menu.getFirstSelectedOption().getText(), "AED");
	}

}
