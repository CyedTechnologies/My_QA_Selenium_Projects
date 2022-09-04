package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects {
	public WebDriver driver;
	
	By username = By.id("inputUsername");
	By password = By.name("inputPassword");
	By button = By.xpath("//button[@class='submit signInBtn']");
	
	public LogInPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getUserName() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getButton() {
		return driver.findElement(button);
	}
	
}
