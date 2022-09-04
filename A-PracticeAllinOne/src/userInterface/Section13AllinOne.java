package userInterface;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Section13AllinOne {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// HTTPS Certification
		/*
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://expired.badssl.com/");
		*/
		// ScreenShot
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.ca");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\ToBeDeleted\\6.png"));
		*/
		// Broken Link finding
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		List <WebElement> allLinks = driver.findElements(By.xpath("//tbody/tr/td/ul/li/a"));
		
		for (int i = 0; i < allLinks.size(); i++) {
			String url = allLinks.get(i).getAttribute("href");
			//System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			//System.out.println(respCode);
			if (respCode > 400) {
				System.out.println("Link Name which is Broken: "+url+" with code: "+respCode);
			}
		}

	}
}
