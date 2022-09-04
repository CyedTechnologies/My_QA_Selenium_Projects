package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
		
	By userName = By.cssSelector("input#user-name");
	By userPass = By.cssSelector("input#password");
	By clickButton = By.cssSelector("input#login-button");
	
	
	public LoginPageObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserName() {
		return driver.findElement(userName);
	}
	public WebElement getUserPassword() {
		return driver.findElement(userPass);
	}
	public WebElement getClickButton() {
		return driver.findElement(clickButton);
	}
	
	

}
