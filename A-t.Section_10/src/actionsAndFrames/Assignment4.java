package actionsAndFrames;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> win = driver.getWindowHandles();
		Iterator <String> iterate = win.iterator();
		String parent = iterate.next();
		String child = iterate.next();
		driver.switchTo().window(child);
		WebElement childText = driver.findElement(By.xpath("//div[@class='example']/h3"));
		System.out.println(childText.getText());
		driver.switchTo().window(parent);
		WebElement parentText = driver.findElement(By.xpath("//div[@class='example']/h3"));
		System.out.println(parentText.getText());

	}

}
