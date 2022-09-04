package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import resources.BaseClass;

public class LoginPageTest extends BaseClass {
	public WebDriver driver;
	
	// Before Test ----------------------
	@BeforeTest
	public void allCommonBefore()  throws IOException {
		driver = initializedDriver();
		driver.get(prop.getProperty("url"));
	}
	
	// Actual Test Cases for Login Page ----------------------
	@Test
	public void TestCase1(){
		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.getUserName().sendKeys("standard_user");
		lpo.getUserPassword().sendKeys("secret_sauce");
		lpo.getClickButton().click();
				
	}
	
	// After Test ----------------------------
	@AfterTest
	public void allCommonAfter() {
		// driver.quit();
	}

}
