package userInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdownMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		WebElement dropMenu = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(dropMenu);
		dropdown.selectByIndex(3);
		Assert.assertEquals("By.xpath(//option[@value='USD'])).getText()", "USD");

	}

}
