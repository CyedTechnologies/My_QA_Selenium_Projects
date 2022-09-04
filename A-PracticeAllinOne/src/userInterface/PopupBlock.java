package userInterface;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupBlock {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.leapwork.com/");
		
	}

}
