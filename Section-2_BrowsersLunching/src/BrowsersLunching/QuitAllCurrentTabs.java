package BrowsersLunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAllCurrentTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.ca");
		driver.manage().window().maximize();
		driver.quit();
	}
}
