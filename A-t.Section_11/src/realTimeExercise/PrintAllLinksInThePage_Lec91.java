package realTimeExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksInThePage_Lec91 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		// -----------------------------------Print All Links in a Web Page
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Total Links: "+driver.findElements(By.tagName("a")).size());
		

	}

}
