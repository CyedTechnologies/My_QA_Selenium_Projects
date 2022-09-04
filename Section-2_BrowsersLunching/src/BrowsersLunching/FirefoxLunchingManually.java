package BrowsersLunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLunchingManually {

	public static void main(String[] args) {	
		System.setProperty("webdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.ca");
	}

}
