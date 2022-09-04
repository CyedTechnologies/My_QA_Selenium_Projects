package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPageFailObjects;
import resources.BaseClass;

public class LoginPageFailTest extends BaseClass {
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
		
		
		LoginPageFailObjects lpfo = new LoginPageFailObjects(driver);
		lpfo.getUserName().sendKeys("abcd");// standard_user
		lpfo.getUserPassword().sendKeys("abc123");// secret_sauce
		lpfo.getClickButton().click();
				
	}
	
	// After Test ----------------------------
	@AfterTest
	public void allCommonAfter() {
		// driver.quit();
	}

}
