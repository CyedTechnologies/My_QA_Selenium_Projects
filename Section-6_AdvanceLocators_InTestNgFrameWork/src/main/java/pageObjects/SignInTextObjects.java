package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInTextObjects {
	public WebDriver driver;
	
	By SIText = By.xpath("//div//form/h1");
	
	// Constructor Stub
	public SignInTextObjects (WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSIText() {
		return driver.findElement(SIText);
	}
	
	
}
