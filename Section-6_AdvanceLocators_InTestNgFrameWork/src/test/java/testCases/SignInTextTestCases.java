package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.SignInTextObjects;
import resources.BaseClass;

public class SignInTextTestCases extends BaseClass {
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@BeforeTest
	public void allBefore() throws IOException, InterruptedException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("URL loaded");
	}
	
	@Test
	public void Test1 () throws InterruptedException {
		SignInTextObjects SP = new SignInTextObjects(driver);
		String text = SP.getSIText().getText();
		log.info(text);
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void allAfter() {
		driver.quit();
	}

}
