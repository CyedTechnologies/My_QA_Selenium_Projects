package section13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPScertificationHandling_Lec104 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
	}

}
