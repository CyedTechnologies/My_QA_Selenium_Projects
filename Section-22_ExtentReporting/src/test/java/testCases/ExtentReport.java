package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeTest
	public void reportTest() {
		String path = System.getProperty("user.dir")+"//report/index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Demo of Extent Reporting");
		report.config().setDocumentTitle("Test Cases");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Syed");
	}
	
	@Test
	public void testCaseNo1() {
		ExtentTest test = extent.createTest("Demo Extent");
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.ca");
		//driver.quit();
		System.out.println(driver.getTitle());
		test.pass("This test is pass");
		
	}
	@Test
	public void testCaseNo2() {
		ExtentTest test = extent.createTest("Report No. 2");
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.ca");
		System.out.println(driver.getTitle());
		test.fail("This test got intentionally faild");
	}
	
	@AfterTest
	public void allCommonAfter() {
		extent.flush();
		driver.close();
	}

}
