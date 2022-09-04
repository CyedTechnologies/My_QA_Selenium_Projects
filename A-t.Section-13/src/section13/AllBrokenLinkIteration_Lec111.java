package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AllBrokenLinkIteration_Lec111 {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		List <WebElement> listOfLinks = driver.findElements(By.xpath("//tbody/tr/td/ul/li/a"));
		SoftAssert a = new SoftAssert();
		
		for (WebElement link:listOfLinks) {
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL (url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode < 400, "Name of borken link is: "+link.getText()+", and code is: "+respCode);
				
		}
		a.assertAll();			
		
	}

}
