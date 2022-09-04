package differentDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownsMenu {

	public static void main(String[] args) throws InterruptedException {

		// Dynamic DropDowns Menu
		// Practice on https://rahulshettyacademy.com/dropdownsPractise/

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='AMD']")).click();
		driver.findElement(By.xpath("(//a[@value='SXR'])[2]")).click();
	}

}
