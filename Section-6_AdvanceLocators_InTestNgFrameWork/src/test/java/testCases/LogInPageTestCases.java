package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LogInPageObjects;
import resources.BaseClass;

public class LogInPageTestCases extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public void allBefore() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized in Landing Page");
		
	}
	
	@Test
	public void Test2 () throws IOException {

		LogInPageObjects lpo = new LogInPageObjects(driver);
		driver.get(prop.getProperty("url"));
		log.info("URL Loaded in Landing Page");
		lpo.getUserName().sendKeys("udemy");
		log.info("User Name successfully entered in Landing Page");
		lpo.getPassword().sendKeys("rahulshettyacademy");
		log.info("Password successfully entered in Landing Page");
		lpo.getButton().click();
		log.info("Button successfully clicked in Landing Page");
	}

	@AfterTest
	public void allAfter () {
		driver.quit();
	}
}
