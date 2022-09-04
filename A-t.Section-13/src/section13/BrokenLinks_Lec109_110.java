package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Lec109_110 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String url1 = driver.findElement(By.cssSelector("a[href*='restapi']")).getAttribute("href");
		System.out.println(url1);
		HttpURLConnection conn = (HttpURLConnection) new URL(url1).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		
		
		String url2 = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		System.out.println(url2);
		HttpURLConnection conn2 = (HttpURLConnection) new URL(url2).openConnection();
		conn2.setRequestMethod("HEAD");
		conn2.connect();
		int respCode2 = conn2.getResponseCode();
		System.out.println(respCode2);
		
		
		
	}

}
