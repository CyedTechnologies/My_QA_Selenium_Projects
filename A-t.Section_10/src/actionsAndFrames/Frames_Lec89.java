package actionsAndFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Lec89 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		Actions actions = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggableText = driver.findElement(By.id("draggable"));
		System.out.println(draggableText.getText());
		Thread.sleep(2000);
		WebElement droppableText = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(draggableText, droppableText).build().perform();
		driver.switchTo().defaultContent();
		
		
	}

}
