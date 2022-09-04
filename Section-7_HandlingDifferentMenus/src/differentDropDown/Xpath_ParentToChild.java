package differentDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ParentToChild {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		// Xpath: Parent to Child with Child Index
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
		// Xpath: Parent to Child without Index
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-ge9izo']//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs']//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[6]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-ge9izo']//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[13]")).click();
		Thread.sleep(500);
		
		
	}

}
