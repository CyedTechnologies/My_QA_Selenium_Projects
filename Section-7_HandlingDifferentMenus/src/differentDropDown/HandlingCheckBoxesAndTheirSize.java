package differentDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBoxesAndTheirSize {
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		// All checkBoxes in this page
		List <WebElement> total = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Total Number of checkBoxes in this page is: "+total.size());
	}

}
