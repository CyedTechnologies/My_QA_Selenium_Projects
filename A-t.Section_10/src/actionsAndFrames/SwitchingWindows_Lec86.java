package actionsAndFrames;

import java.util.Set;
import java.time.Duration;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows_Lec86 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> win = driver.getWindowHandles();
		Iterator <String> it = win.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		WebElement text = driver.findElement(By.xpath("//p[@class='im-para red']"));
		System.out.println(text.getText());
		String [] split1 = text.getText().split("with");
		String [] split2 = split1[0].split("at");
		String email = split2[1].trim();
		System.out.println(email);
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
	}

}
