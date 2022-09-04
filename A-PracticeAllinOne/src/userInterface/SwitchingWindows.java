package userInterface;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> w = driver.getWindowHandles();
		Iterator<String> itr = w.iterator();
		String parent = itr.next();
		String child = itr.next();

		driver.switchTo().window(child);
		WebElement childText = driver.findElement(By.cssSelector("div[class='example'] h3"));
		System.out.println(childText.getText());

		driver.switchTo().window(parent);
		WebElement parentText = driver.findElement(By.xpath("//div[@class='example']/h3"));
		System.out.println(parentText.getText());

	}

}
